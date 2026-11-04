package com.getkeepsafe.relinker;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public class a implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f102865a = 5;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f102866b = 4096;

    /* JADX INFO: renamed from: com.getkeepsafe.relinker.a$a, reason: collision with other inner class name */
    private static class C0929a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ZipFile f102867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ZipEntry f102868b;

        public C0929a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f102867a = zipFile;
            this.f102868b = zipEntry;
        }
    }

    private void b(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private long c(InputStream in, OutputStream out) throws IOException {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int i10 = in.read(bArr);
            if (i10 == -1) {
                out.flush();
                return j10;
            }
            out.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }

    private C0929a d(final Context context, final String[] abis, final String mappedLibraryName, final f instance) {
        String[] strArrF = f(context);
        int length = strArrF.length;
        int i10 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i10 >= length) {
                return null;
            }
            String str = strArrF[i10];
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str), 1);
                    break;
                } catch (IOException unused) {
                    i11 = i12;
                }
            }
            if (zipFile != null) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i13 < 5) {
                        for (String str2 : abis) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("lib");
                            char c10 = File.separatorChar;
                            sb2.append(c10);
                            sb2.append(str2);
                            sb2.append(c10);
                            sb2.append(mappedLibraryName);
                            String string = sb2.toString();
                            instance.m("Looking for %s in APK %s...", string, str);
                            ZipEntry entry = zipFile.getEntry(string);
                            if (entry != null) {
                                return new C0929a(zipFile, entry);
                            }
                        }
                        i13 = i14;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i10++;
        }
    }

    private String[] e(Context context, String mappedLibraryName) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lib");
        char c10 = File.separatorChar;
        sb2.append(c10);
        sb2.append("([^\\");
        sb2.append(c10);
        sb2.append("]*)");
        sb2.append(c10);
        sb2.append(mappedLibraryName);
        Pattern patternCompile = Pattern.compile(sb2.toString());
        HashSet hashSet = new HashSet();
        int i10 = 3 << 0;
        for (String str : f(context)) {
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new File(str), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private String[] f(final Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // com.getkeepsafe.relinker.e.a
    @e.a({"SetWorldReadable"})
    public void a(Context context, String[] strArr, String str, File file, f fVar) throws Throwable {
        String[] strArrE;
        ZipFile zipFile;
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        C0929a c0929a = null;
        Closeable closeable = null;
        try {
            C0929a c0929aD = d(context, strArr, str, fVar);
            try {
                if (c0929aD == null) {
                    try {
                        strArrE = e(context, str);
                    } catch (Exception e10) {
                        strArrE = new String[]{e10.toString()};
                    }
                    throw new c(str, strArr, strArrE);
                }
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    try {
                        if (i10 >= 5) {
                            fVar.l("FATAL! Couldn't extract the library from the APK!");
                            zipFile = c0929aD.f102867a;
                            if (zipFile != null) {
                                break;
                            } else {
                                return;
                            }
                        }
                        fVar.m("Found %s! Extracting...", str);
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream = c0929aD.f102867a.getInputStream(c0929aD.f102868b);
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            long jC = c(inputStream, fileOutputStream);
                                            fileOutputStream.getFD().sync();
                                            if (jC == file.length()) {
                                                b(inputStream);
                                                b(fileOutputStream);
                                                file.setReadable(true, false);
                                                file.setExecutable(true, false);
                                                file.setWritable(true);
                                                zipFile = c0929aD.f102867a;
                                                if (zipFile != null) {
                                                    break;
                                                } else {
                                                    return;
                                                }
                                            }
                                            b(inputStream);
                                            b(fileOutputStream);
                                        } catch (FileNotFoundException unused) {
                                            b(inputStream);
                                        } catch (IOException unused2) {
                                            b(inputStream);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            closeable = inputStream;
                                            b(closeable);
                                            b(fileOutputStream);
                                            throw th;
                                        }
                                    } catch (FileNotFoundException unused3) {
                                        fileOutputStream = null;
                                    } catch (IOException unused4) {
                                        fileOutputStream = null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fileOutputStream = null;
                                    }
                                } catch (FileNotFoundException unused5) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (IOException unused6) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fileOutputStream = null;
                                }
                            }
                        } catch (IOException unused7) {
                        }
                        i10 = i11;
                    } catch (IOException unused8) {
                        return;
                    }
                }
                zipFile.close();
            } catch (Throwable th5) {
                th = th5;
                c0929a = c0929aD;
                if (c0929a != null) {
                    try {
                        ZipFile zipFile2 = c0929a.f102867a;
                        if (zipFile2 != null) {
                            zipFile2.close();
                        }
                    } catch (IOException unused9) {
                    }
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }
}
