/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cStopPow;

public class DoubleVector2D {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DoubleVector2D(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DoubleVector2D obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        cStopPowJNI.delete_DoubleVector2D(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoubleVector2D() {
    this(cStopPowJNI.new_DoubleVector2D__SWIG_0(), true);
  }

  public DoubleVector2D(long n) {
    this(cStopPowJNI.new_DoubleVector2D__SWIG_1(n), true);
  }

  public long size() {
    return cStopPowJNI.DoubleVector2D_size(swigCPtr, this);
  }

  public long capacity() {
    return cStopPowJNI.DoubleVector2D_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    cStopPowJNI.DoubleVector2D_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return cStopPowJNI.DoubleVector2D_isEmpty(swigCPtr, this);
  }

  public void clear() {
    cStopPowJNI.DoubleVector2D_clear(swigCPtr, this);
  }

  public void add(DoubleVector x) {
    cStopPowJNI.DoubleVector2D_add(swigCPtr, this, DoubleVector.getCPtr(x), x);
  }

  public DoubleVector get(int i) {
    return new DoubleVector(cStopPowJNI.DoubleVector2D_get(swigCPtr, this, i), false);
  }

  public void set(int i, DoubleVector val) {
    cStopPowJNI.DoubleVector2D_set(swigCPtr, this, i, DoubleVector.getCPtr(val), val);
  }

}
