package com.sun.jna.ptr;

import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes13.dex */
public class DoubleByReference extends ByReference {
    public DoubleByReference() {
        this(0.0d);
    }

    public double getValue() {
        return getPointer().getDouble(0L);
    }

    public void setValue(double d10) {
        getPointer().setDouble(0L, d10);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return String.format("double@0x%x=%s", Long.valueOf(Pointer.nativeValue(getPointer())), Double.valueOf(getValue()));
    }

    public DoubleByReference(double d10) {
        super(8);
        setValue(d10);
    }
}
