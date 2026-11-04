package com.getkeepsafe.relinker;

import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
final class g implements e.b {
    g() {
    }

    @Override // com.getkeepsafe.relinker.e.b
    public String a(String mappedLibraryName) {
        return mappedLibraryName.substring(3, mappedLibraryName.length() - 3);
    }

    @Override // com.getkeepsafe.relinker.e.b
    public String[] b() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !h.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // com.getkeepsafe.relinker.e.b
    @e.a({"UnsafeDynamicallyLoadedCode"})
    public void c(final String libraryPath) {
        System.load(libraryPath);
    }

    @Override // com.getkeepsafe.relinker.e.b
    public void d(final String libraryName) {
        System.loadLibrary(libraryName);
    }

    @Override // com.getkeepsafe.relinker.e.b
    public String e(final String libraryName) {
        return (libraryName.startsWith("lib") && libraryName.endsWith(".so")) ? libraryName : System.mapLibraryName(libraryName);
    }
}
