/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package cStopPow;

public class StopPow_Plasma extends StopPow {
  private transient long swigCPtr;

  protected StopPow_Plasma(long cPtr, boolean cMemoryOwn) {
    super(cStopPowJNI.StopPow_Plasma_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StopPow_Plasma obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        cStopPowJNI.delete_StopPow_Plasma(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double dEdx_field(double E, int i) {
    return cStopPowJNI.StopPow_Plasma_dEdx_field(swigCPtr, this, E, i);
  }

  public double dEdx_plasma_electrons(double E) throws java.lang.IllegalArgumentException {
    return cStopPowJNI.StopPow_Plasma_dEdx_plasma_electrons(swigCPtr, this, E);
  }

  public double dEdx_plasma_ions(double E) throws java.lang.IllegalArgumentException {
    return cStopPowJNI.StopPow_Plasma_dEdx_plasma_ions(swigCPtr, this, E);
  }

  public void set_particle(double mt, double Zt) throws java.lang.IllegalArgumentException {
    cStopPowJNI.StopPow_Plasma_set_particle(swigCPtr, this, mt, Zt);
  }

  public void set_field(DoubleVector mf, DoubleVector Zf, DoubleVector Tf, DoubleVector nf) throws java.lang.IllegalArgumentException {
    cStopPowJNI.StopPow_Plasma_set_field__SWIG_0(swigCPtr, this, DoubleVector.getCPtr(mf), mf, DoubleVector.getCPtr(Zf), Zf, DoubleVector.getCPtr(Tf), Tf, DoubleVector.getCPtr(nf), nf);
  }

  public void set_field(SWIGTYPE_p_std__vectorT_std__arrayT_double_4_t_t field) throws java.lang.IllegalArgumentException {
    cStopPowJNI.StopPow_Plasma_set_field__SWIG_1(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__arrayT_double_4_t_t.getCPtr(field));
  }

  public void set_field(DoubleVector mf, DoubleVector Zf, DoubleVector Tf, DoubleVector nf, double Te) throws java.lang.IllegalArgumentException {
    cStopPowJNI.StopPow_Plasma_set_field__SWIG_2(swigCPtr, this, DoubleVector.getCPtr(mf), mf, DoubleVector.getCPtr(Zf), Zf, DoubleVector.getCPtr(Tf), Tf, DoubleVector.getCPtr(nf), nf, Te);
  }

  public void set_field(SWIGTYPE_p_std__vectorT_std__arrayT_double_4_t_t field, double Te) throws java.lang.IllegalArgumentException {
    cStopPowJNI.StopPow_Plasma_set_field__SWIG_3(swigCPtr, this, SWIGTYPE_p_std__vectorT_std__arrayT_double_4_t_t.getCPtr(field), Te);
  }

  public void on_field_change() {
    cStopPowJNI.StopPow_Plasma_on_field_change(swigCPtr, this);
  }

}
