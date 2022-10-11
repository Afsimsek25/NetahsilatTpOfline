package io.testproject.addon;

import io.testproject.sdk.internal.addons.ActionProxy;
import io.testproject.sdk.internal.addons.ProxyDescriptor;

/**
 * Proxy for Mathematical Utilities Addon */
public class MathematicalUtilities {
  /**
   * Factory method for EvaluateMathExpr */
  public static EvaluateMathExpr getEvaluateMathExpr() {
    return new EvaluateMathExpr();
  }

  /**
   * Factory method for EvaluateMathExpr
   * @param expression Expression */
  public static EvaluateMathExpr evaluateMathExpr(String expression) {
    return new EvaluateMathExpr(expression);
  }

  /**
   * Evaluate Mathematical Expression. Evaluates mathematical expression */
  public static class EvaluateMathExpr extends ActionProxy {
    /**
     * Expression (INPUT) */
    public String expression;

    /**
     * Result (OUTPUT) */
    public String result;

    public EvaluateMathExpr() {
      this.setDescriptor(new ProxyDescriptor("rxLEAqSrKE-MmdgcUtqD4Q", "addon.EvaluateMathExpr"));
    }

    public EvaluateMathExpr(String expression) {
      this();
      this.expression = expression;
    }
  }
}
