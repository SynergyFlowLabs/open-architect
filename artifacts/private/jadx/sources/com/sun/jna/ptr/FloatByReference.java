package com.sun.jna.ptr;

import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes13.dex */
public class FloatByReference extends ByReference {
    public FloatByReference() {
        this(0.0f);
    }

    public float getValue() {
        return getPointer().getFloat(0L);
    }

    public void setValue(float f10) {
        getPointer().setFloat(0L, f10);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return String.format("float@0x%x=%s", Long.valueOf(Pointer.nativeValue(getPointer())), Float.valueOf(getValue()));
    }

    public FloatByReference(float f10) {
        super(4);
        setValue(f10);
    }
}
