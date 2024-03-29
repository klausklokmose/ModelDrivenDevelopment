package org.xtext.example.mydsl1.validation;

import com.google.common.base.Objects;
import featureModel.BinaryOperation;
import featureModel.BinaryOperator;
import featureModel.Expression;
import featureModel.Feature;
import featureModel.Group;
import featureModel.Identifier;
import featureModel.Model;
import featureModel.NULL;
import featureModel.SimpleType;
import featureModel.SolitaryFeature;
import featureModel.UnaryOperation;
import featureModel.UnaryOperator;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl1.validation.AbstractMyDslValidator;

@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  @Check
  public void featureShouldHaveUniquelyNamedSubFeatures(final Feature it) {
    final ArrayList<String> arr = new ArrayList<String>();
    EList<SolitaryFeature> _features = it.getFeatures();
    final Consumer<SolitaryFeature> _function = new Consumer<SolitaryFeature>() {
      public void accept(final SolitaryFeature f) {
        String _name = f.getName();
        boolean _contains = arr.contains(_name);
        boolean _not = (!_contains);
        if (_not) {
          String _name_1 = f.getName();
          arr.add(_name_1);
        } else {
          String _name_2 = f.getName();
          String _plus = ("feature: \"" + _name_2);
          String _plus_1 = (_plus + "\" appear multiple times inside feature: ");
          String _name_3 = it.getName();
          String _plus_2 = (_plus_1 + _name_3);
          MyDslValidator.this.error(_plus_2, f, null, "naming");
        }
      }
    };
    _features.forEach(_function);
  }
  
  private int count = 0;
  
  @Check
  public void onlyOneExclusiveSelectGroupPerFeature(final Feature it) {
    this.count = 0;
    EList<Group> _groups = it.getGroups();
    final Consumer<Group> _function = new Consumer<Group>() {
      public void accept(final Group group) {
        boolean _isInclusive = group.isInclusive();
        boolean _not = (!_isInclusive);
        if (_not) {
          MyDslValidator.this.count++;
        }
      }
    };
    _groups.forEach(_function);
    if ((this.count > 1)) {
      this.error("Only one exclusive select in each feature!", it, null, "one exclusive select");
    }
  }
  
  @Check
  public void onlyRootFeatureCanHaveConstraints(final Model it) {
    EList<Feature> _rootFeature = it.getRootFeature();
    final Function1<Feature, Boolean> _function = new Function1<Feature, Boolean>() {
      public Boolean apply(final Feature features) {
        return Boolean.valueOf(MyDslValidator.this.check(features));
      }
    };
    final boolean r = IterableExtensions.<Feature>forall(_rootFeature, _function);
    if ((!r)) {
      this.error("Put constraints after the last feature.", it, null, "put constraints in root feature");
    }
  }
  
  public boolean check(final Feature it) {
    EList<SolitaryFeature> _features = it.getFeatures();
    final Function1<SolitaryFeature, Boolean> _function = new Function1<SolitaryFeature, Boolean>() {
      public Boolean apply(final SolitaryFeature features) {
        return Boolean.valueOf(MyDslValidator.this.checkNotContainConstraints(features));
      }
    };
    return IterableExtensions.<SolitaryFeature>forall(_features, _function);
  }
  
  public boolean checkNotContainConstraints(final Feature it) {
    EList<Expression> _constraints = it.getConstraints();
    final boolean r = _constraints.isEmpty();
    if ((!r)) {
      this.error("only rootfeature can have constraints", it, null, "put constraints in root feature");
    }
    boolean _and = false;
    if (!r) {
      _and = false;
    } else {
      EList<SolitaryFeature> _features = it.getFeatures();
      final Function1<SolitaryFeature, Boolean> _function = new Function1<SolitaryFeature, Boolean>() {
        public Boolean apply(final SolitaryFeature features) {
          return Boolean.valueOf(MyDslValidator.this.checkNotContainConstraints(features));
        }
      };
      boolean _forall = IterableExtensions.<SolitaryFeature>forall(_features, _function);
      _and = _forall;
    }
    return _and;
  }
  
  @Check
  public void topConstraintShouldBeBoolean(final Feature f) {
    EList<Expression> _constraints = f.getConstraints();
    for (final Expression constraint : _constraints) {
      SimpleType _type = this.getType(constraint);
      boolean _equals = Objects.equal(_type, SimpleType.BOOLEAN);
      boolean _not = (!_equals);
      if (_not) {
        this.error("top constraint must be boolean", f, null, "invalid type");
      }
    }
  }
  
  public SimpleType getType(final Expression e) {
    try {
      SimpleType _xifexpression = null;
      if ((e instanceof Identifier)) {
        SimpleType _xblockexpression = null;
        {
          final Identifier id = ((Identifier) e);
          EList<Feature> _ref = id.getRef();
          EList<Feature> _ref_1 = id.getRef();
          int _size = _ref_1.size();
          int _minus = (_size - 1);
          Feature _get = _ref.get(_minus);
          _xblockexpression = _get.getType();
        }
        _xifexpression = _xblockexpression;
      } else {
        SimpleType _xifexpression_1 = null;
        if ((e instanceof BinaryOperation)) {
          SimpleType _xblockexpression_1 = null;
          {
            final BinaryOperation binOp = ((BinaryOperation) e);
            final BinaryOperator op = binOp.getOperator();
            Expression _lexp = binOp.getLexp();
            final SimpleType ltype = this.getType(_lexp);
            Expression _rexp = binOp.getRexp();
            final SimpleType rtype = this.getType(_rexp);
            SimpleType _xifexpression_2 = null;
            boolean _equals = Objects.equal(ltype, rtype);
            if (_equals) {
              SimpleType _xifexpression_3 = null;
              boolean _or = false;
              boolean _equals_1 = Objects.equal(op, BinaryOperator.AND);
              if (_equals_1) {
                _or = true;
              } else {
                boolean _equals_2 = Objects.equal(op, BinaryOperator.OR);
                _or = _equals_2;
              }
              if (_or) {
                SimpleType _xifexpression_4 = null;
                boolean _equals_3 = Objects.equal(ltype, SimpleType.BOOLEAN);
                if (_equals_3) {
                  _xifexpression_4 = ltype;
                } else {
                  SimpleType _xifexpression_5 = null;
                  boolean _equals_4 = Objects.equal(rtype, SimpleType.BOOLEAN);
                  if (_equals_4) {
                    _xifexpression_5 = rtype;
                  } else {
                    this.error("top constraint must be boolean", e, null, "invalid type");
                    throw new Exception("invalid type, must be boolean with And or Or operator");
                  }
                  _xifexpression_4 = _xifexpression_5;
                }
                _xifexpression_3 = _xifexpression_4;
              } else {
                SimpleType _xifexpression_6 = null;
                boolean _or_1 = false;
                boolean _or_2 = false;
                boolean _equals_5 = Objects.equal(op, BinaryOperator.EQUALS);
                if (_equals_5) {
                  _or_2 = true;
                } else {
                  boolean _equals_6 = Objects.equal(op, BinaryOperator.HIGHER);
                  _or_2 = _equals_6;
                }
                if (_or_2) {
                  _or_1 = true;
                } else {
                  boolean _equals_7 = Objects.equal(op, BinaryOperator.LOWER);
                  _or_1 = _equals_7;
                }
                if (_or_1) {
                  _xifexpression_6 = SimpleType.BOOLEAN;
                } else {
                  SimpleType _xifexpression_7 = null;
                  boolean _or_3 = false;
                  boolean _or_4 = false;
                  boolean _or_5 = false;
                  boolean _equals_8 = Objects.equal(op, BinaryOperator.DIVIDE);
                  if (_equals_8) {
                    _or_5 = true;
                  } else {
                    boolean _equals_9 = Objects.equal(op, BinaryOperator.MULTIPLY);
                    _or_5 = _equals_9;
                  }
                  if (_or_5) {
                    _or_4 = true;
                  } else {
                    boolean _equals_10 = Objects.equal(op, BinaryOperator.ADD);
                    _or_4 = _equals_10;
                  }
                  if (_or_4) {
                    _or_3 = true;
                  } else {
                    boolean _equals_11 = Objects.equal(op, BinaryOperator.SUBTRACT);
                    _or_3 = _equals_11;
                  }
                  if (_or_3) {
                    SimpleType _xifexpression_8 = null;
                    boolean _or_6 = false;
                    boolean _equals_12 = Objects.equal(ltype, SimpleType.INT);
                    if (_equals_12) {
                      _or_6 = true;
                    } else {
                      boolean _equals_13 = Objects.equal(ltype, SimpleType.DOUBLE);
                      _or_6 = _equals_13;
                    }
                    if (_or_6) {
                      _xifexpression_8 = ltype;
                    } else {
                      this.error("division, multiply, addition or subtraction must be type int or Double", e, null, "invalid type");
                      throw new Exception("invalid type");
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_3 = _xifexpression_6;
              }
              _xifexpression_2 = _xifexpression_3;
            } else {
              SimpleType _xifexpression_9 = null;
              boolean _and = false;
              boolean _and_1 = false;
              boolean _equals_14 = Objects.equal(ltype, SimpleType.NULLTYPE);
              if (!_equals_14) {
                _and_1 = false;
              } else {
                boolean _equals_15 = Objects.equal(rtype, SimpleType.STRING);
                _and_1 = _equals_15;
              }
              if (!_and_1) {
                _and = false;
              } else {
                boolean _equals_16 = Objects.equal(op, BinaryOperator.EQUALS);
                _and = _equals_16;
              }
              if (_and) {
                _xifexpression_9 = SimpleType.BOOLEAN;
              } else {
                SimpleType _xifexpression_10 = null;
                boolean _and_2 = false;
                boolean _and_3 = false;
                boolean _equals_17 = Objects.equal(rtype, SimpleType.NULLTYPE);
                if (!_equals_17) {
                  _and_3 = false;
                } else {
                  boolean _equals_18 = Objects.equal(ltype, SimpleType.STRING);
                  _and_3 = _equals_18;
                }
                if (!_and_3) {
                  _and_2 = false;
                } else {
                  boolean _equals_19 = Objects.equal(op, BinaryOperator.EQUALS);
                  _and_2 = _equals_19;
                }
                if (_and_2) {
                  _xifexpression_10 = SimpleType.BOOLEAN;
                } else {
                  boolean _notEquals = (!Objects.equal(ltype, rtype));
                  if (_notEquals) {
                    this.error("left and right hand side of binary expression should be the same", e, null, "invalid type");
                    throw new Exception(((((("invalid type" + ltype) + " ") + rtype) + " ") + op));
                  } else {
                    this.error("something else went wrong", e, null, "invalid type");
                    throw new Exception("invalid type");
                  }
                }
                _xifexpression_9 = _xifexpression_10;
              }
              _xifexpression_2 = _xifexpression_9;
            }
            _xblockexpression_1 = _xifexpression_2;
          }
          _xifexpression_1 = _xblockexpression_1;
        } else {
          SimpleType _xifexpression_2 = null;
          if ((e instanceof UnaryOperation)) {
            SimpleType _xblockexpression_2 = null;
            {
              final UnaryOperation expression = ((UnaryOperation) e);
              Expression _exp = expression.getExp();
              final SimpleType eType = this.getType(_exp);
              final UnaryOperator op = expression.getOperator();
              SimpleType _xifexpression_3 = null;
              boolean _or = false;
              boolean _and = false;
              boolean _equals = Objects.equal(op, UnaryOperator.NOT);
              if (!_equals) {
                _and = false;
              } else {
                boolean _equals_1 = Objects.equal(eType, SimpleType.BOOLEAN);
                _and = _equals_1;
              }
              if (_and) {
                _or = true;
              } else {
                boolean _and_1 = false;
                boolean _equals_2 = Objects.equal(op, UnaryOperator.MINUS);
                if (!_equals_2) {
                  _and_1 = false;
                } else {
                  boolean _or_1 = false;
                  boolean _equals_3 = Objects.equal(eType, SimpleType.INT);
                  if (_equals_3) {
                    _or_1 = true;
                  } else {
                    boolean _equals_4 = Objects.equal(eType, SimpleType.DOUBLE);
                    _or_1 = _equals_4;
                  }
                  _and_1 = _or_1;
                }
                _or = _and_1;
              }
              if (_or) {
                _xifexpression_3 = eType;
              } else {
                this.error("not correct type in unary expression", e, null, "invalid type");
                throw new Exception("invalid type");
              }
              _xblockexpression_2 = _xifexpression_3;
            }
            _xifexpression_2 = _xblockexpression_2;
          } else {
            SimpleType _xifexpression_3 = null;
            if ((e instanceof NULL)) {
              _xifexpression_3 = SimpleType.NULLTYPE;
            } else {
              _xifexpression_3 = SimpleType.INT;
            }
            _xifexpression_2 = _xifexpression_3;
          }
          _xifexpression_1 = _xifexpression_2;
        }
        _xifexpression = _xifexpression_1;
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
