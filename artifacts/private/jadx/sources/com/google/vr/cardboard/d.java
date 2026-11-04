package com.google.vr.cardboard;

import android.net.Uri;
import android.os.Environment;
import android.util.Base64;
import com.google.vr.sdk.deps.b7;
import com.google.vr.sdk.deps.c7;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f126820a = "d";

    private static File a(String str) throws IllegalStateException {
        File file = new File(Environment.getExternalStorageDirectory(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 61);
            sb2.append(strValueOf);
            sb2.append(" already exists as a file, but is expected to be a directory.");
            throw new IllegalStateException(sb2.toString());
        }
        return new File(file, str);
    }

    public static com.google.vr.sdk.proto.nano.a.c b() {
        return (com.google.vr.sdk.proto.nano.a.c) e(com.google.vr.sdk.proto.nano.a.c.class, "current_device_params", 894990891, true);
    }

    public static com.google.vr.sdk.proto.nano.a.c c(Uri uri) {
        String queryParameter = uri.getQueryParameter("p");
        if (queryParameter == null) {
            return null;
        }
        try {
            return (com.google.vr.sdk.proto.nano.a.c) c7.f(new com.google.vr.sdk.proto.nano.a.c(), Base64.decode(queryParameter, 11));
        } catch (Exception e10) {
            new StringBuilder(String.valueOf(e10).length() + 46);
            return null;
        }
    }

    public static com.google.vr.sdk.proto.nano.b.a d() {
        return (com.google.vr.sdk.proto.nano.b.a) e(com.google.vr.sdk.proto.nano.b.a.class, "phone_params", 779508118, false);
    }

    private static <T extends c7> T e(Class<T> cls, String str, int i10, boolean z10) throws Throwable {
        BufferedInputStream bufferedInputStream;
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(a(str)));
                try {
                    T t10 = (T) f(cls, bufferedInputStream, i10);
                    try {
                        bufferedInputStream.close();
                        return t10;
                    } catch (IOException unused) {
                        return t10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedInputStream != null) {
                        try {
                            bufferedInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    try {
                        throw th;
                    } catch (FileNotFoundException e10) {
                        if (z10) {
                            new StringBuilder(String.valueOf(e10).length() + 39);
                        }
                        return null;
                    }
                }
            } catch (IllegalStateException e11) {
                new StringBuilder(String.valueOf(e11).length() + 26);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream = null;
        }
    }

    private static <T extends c7> T f(Class<T> cls, InputStream inputStream, int i10) {
        if (inputStream == null) {
            return null;
        }
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            if (inputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length) == -1) {
                return null;
            }
            int i11 = byteBufferAllocate.getInt();
            int i12 = byteBufferAllocate.getInt();
            if (i11 != i10) {
                return null;
            }
            byte[] bArr = new byte[i12];
            if (inputStream.read(bArr, 0, i12) == -1) {
                return null;
            }
            return (T) c7.f(cls.newInstance(), bArr);
        } catch (b7 e10) {
            String strValueOf = String.valueOf(e10.toString());
            if (strValueOf.length() != 0) {
                "Error parsing protocol buffer: ".concat(strValueOf);
            }
            return null;
        } catch (IOException e11) {
            String strValueOf2 = String.valueOf(e11.toString());
            if (strValueOf2.length() != 0) {
                "Error reading parameters: ".concat(strValueOf2);
            }
            return null;
        } catch (IllegalAccessException e12) {
            String strValueOf3 = String.valueOf(e12.toString());
            if (strValueOf3.length() != 0) {
                "Error accessing parameter type: ".concat(strValueOf3);
            }
            return null;
        } catch (InstantiationException e13) {
            String strValueOf4 = String.valueOf(e13.toString());
            if (strValueOf4.length() != 0) {
                "Error creating parameters: ".concat(strValueOf4);
            }
            return null;
        }
    }

    public static boolean g() {
        try {
            File fileA = a("current_device_params");
            if (fileA.exists()) {
                return fileA.delete();
            }
            return true;
        } catch (IllegalStateException e10) {
            new StringBuilder(String.valueOf(e10).length() + 34);
            return false;
        }
    }

    public static boolean h(com.google.vr.sdk.proto.nano.a.c cVar) {
        return i(cVar, "current_device_params", 894990891);
    }

    private static boolean i(c7 c7Var, String str, int i10) throws Throwable {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(a(str)));
                    try {
                        boolean zJ = j(c7Var, bufferedOutputStream2, i10);
                        try {
                            bufferedOutputStream2.close();
                            return zJ;
                        } catch (IOException unused) {
                            return zJ;
                        }
                    } catch (FileNotFoundException e10) {
                        e = e10;
                        bufferedOutputStream = bufferedOutputStream2;
                        new StringBuilder(String.valueOf(e).length() + 39);
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        return false;
                    } catch (IllegalStateException e11) {
                        e = e11;
                        bufferedOutputStream = bufferedOutputStream2;
                        new StringBuilder(String.valueOf(e).length() + 26);
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (FileNotFoundException e12) {
                e = e12;
            } catch (IllegalStateException e13) {
                e = e13;
            }
        } catch (IOException unused3) {
        }
    }

    private static boolean j(c7 c7Var, OutputStream outputStream, int i10) {
        try {
            byte[] bArrJ = c7.j(c7Var);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
            byteBufferAllocate.putInt(i10);
            byteBufferAllocate.putInt(bArrJ.length);
            outputStream.write(byteBufferAllocate.array());
            outputStream.write(bArrJ);
            return true;
        } catch (IOException e10) {
            String strValueOf = String.valueOf(e10.toString());
            if (strValueOf.length() == 0) {
                return false;
            }
            "Error writing parameters: ".concat(strValueOf);
            return false;
        }
    }
}
