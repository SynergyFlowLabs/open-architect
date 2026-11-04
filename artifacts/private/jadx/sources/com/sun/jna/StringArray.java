package com.sun.jna;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class StringArray extends Memory implements Function.PostCallRead {
    private String encoding;
    private List<NativeString> natives;
    private Object[] original;

    public StringArray(String[] strArr) {
        this(strArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object[]] */
    @Override // com.sun.jna.Function.PostCallRead
    public void read() {
        ?? wString;
        String string;
        String wideString;
        boolean z10 = this.original instanceof WString[];
        boolean zEquals = "--WIDE-STRING--".equals(this.encoding);
        for (int i10 = 0; i10 < this.original.length; i10++) {
            Pointer pointer = getPointer(Native.POINTER_SIZE * i10);
            if (pointer != null) {
                if (zEquals) {
                    wideString = pointer.getWideString(0L);
                } else {
                    string = pointer.getString(0L, this.encoding);
                }
                if (z10) {
                    wString = string;
                    wString = wideString;
                    wString = new WString(wString);
                } else {
                    wString = string;
                    wString = wideString;
                }
            } else {
                wString = 0;
            }
            this.original[i10] = wString;
        }
    }

    @Override // com.sun.jna.Memory, com.sun.jna.Pointer
    public String toString() {
        return ("--WIDE-STRING--".equals(this.encoding) ? "const wchar_t*[]" : "const char*[]") + Arrays.asList(this.original);
    }

    public StringArray(String[] strArr, boolean z10) {
        this((Object[]) strArr, z10 ? "--WIDE-STRING--" : Native.getDefaultStringEncoding());
    }

    public StringArray(String[] strArr, String str) {
        this((Object[]) strArr, str);
    }

    public StringArray(WString[] wStringArr) {
        this(wStringArr, "--WIDE-STRING--");
    }

    private StringArray(Object[] objArr, String str) {
        super((objArr.length + 1) * Native.POINTER_SIZE);
        this.natives = new ArrayList();
        this.original = objArr;
        this.encoding = str;
        int i10 = 0;
        while (true) {
            Pointer pointer = null;
            if (i10 < objArr.length) {
                Object obj = objArr[i10];
                if (obj != null) {
                    NativeString nativeString = new NativeString(obj.toString(), str);
                    this.natives.add(nativeString);
                    pointer = nativeString.getPointer();
                }
                setPointer(Native.POINTER_SIZE * i10, pointer);
                i10++;
            } else {
                setPointer(Native.POINTER_SIZE * objArr.length, null);
                return;
            }
        }
    }
}
