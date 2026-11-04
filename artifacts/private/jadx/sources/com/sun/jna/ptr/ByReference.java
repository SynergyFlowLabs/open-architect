package com.sun.jna.ptr;

import com.sun.jna.Memory;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;

/* JADX INFO: loaded from: classes13.dex */
public abstract class ByReference extends PointerType {
    protected ByReference(int i10) {
        setPointer(new Memory(i10));
    }

    @Override // com.sun.jna.PointerType
    public String toString() {
        try {
            Object objInvoke = getClass().getMethod("getValue", null).invoke(this, null);
            return objInvoke == null ? String.format("null@0x%x", Long.valueOf(Pointer.nativeValue(getPointer()))) : String.format("%s@0x%x=%s", objInvoke.getClass().getSimpleName(), Long.valueOf(Pointer.nativeValue(getPointer())), objInvoke);
        } catch (Exception e10) {
            return String.format("ByReference Contract violated - %s#getValue raised exception: %s", getClass().getName(), e10.getMessage());
        }
    }
}
