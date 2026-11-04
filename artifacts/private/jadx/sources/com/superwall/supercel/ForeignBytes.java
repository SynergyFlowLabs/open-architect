package com.superwall.supercel;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import oj.f;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Structure.FieldOrder({"len", "data"})
public class ForeignBytes extends Structure {

    @f
    @Nullable
    public Pointer data;

    @f
    public int len;

    public static final class ByValue extends ForeignBytes implements Structure.ByValue {
    }
}
