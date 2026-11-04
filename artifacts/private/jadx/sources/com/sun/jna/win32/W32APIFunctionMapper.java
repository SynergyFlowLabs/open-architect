package com.sun.jna.win32;

import androidx.exifinterface.media.a;
import com.sun.jna.FunctionMapper;
import com.sun.jna.NativeLibrary;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes13.dex */
public class W32APIFunctionMapper implements FunctionMapper {
    private final String suffix;
    public static final FunctionMapper UNICODE = new W32APIFunctionMapper(true);
    public static final FunctionMapper ASCII = new W32APIFunctionMapper(false);

    protected W32APIFunctionMapper(boolean z10) {
        this.suffix = z10 ? a.U4 : a.X4;
    }

    @Override // com.sun.jna.FunctionMapper
    public String getFunctionName(NativeLibrary nativeLibrary, Method method) {
        String name = method.getName();
        if (!name.endsWith(a.U4) && !name.endsWith(a.X4)) {
            try {
                return nativeLibrary.getFunction(name + this.suffix, 63).getName();
            } catch (UnsatisfiedLinkError unused) {
            }
        }
        return name;
    }
}
