/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cStopPow;

public class DoubleVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected DoubleVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DoubleVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        cStopPowJNI.delete_DoubleVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public DoubleVector() {
    this(cStopPowJNI.new_DoubleVector__SWIG_0(), true);
  }

  public DoubleVector(long n) {
    this(cStopPowJNI.new_DoubleVector__SWIG_1(n), true);
  }

  public long size() {
    return cStopPowJNI.DoubleVector_size(swigCPtr, this);
  }

  public long capacity() {
    return cStopPowJNI.DoubleVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    cStopPowJNI.DoubleVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return cStopPowJNI.DoubleVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    cStopPowJNI.DoubleVector_clear(swigCPtr, this);
  }

  public void add(double x) {
    cStopPowJNI.DoubleVector_add(swigCPtr, this, x);
  }

  public double get(int i) {
    return cStopPowJNI.DoubleVector_get(swigCPtr, this, i);
  }

  public void set(int i, double val) {
    cStopPowJNI.DoubleVector_set(swigCPtr, this, i, val);
  }

}
