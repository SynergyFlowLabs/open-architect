package kotlin.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1288#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
public class p extends o {

    static final class a extends l0 implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f312597a = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void invoke(File file, IOException exception) throws IOException {
            Intrinsics.checkNotNullParameter(file, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(exception, "exception");
            throw exception;
        }
    }

    static final class b extends l0 implements Function2<File, IOException, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<File, IOException, t> f312598a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super File, ? super IOException, ? extends t> function2) {
            super(2);
            this.f312598a = function2;
        }

        public final void c(File f10, IOException e10) throws w {
            Intrinsics.checkNotNullParameter(f10, "f");
            Intrinsics.checkNotNullParameter(e10, "e");
            if (this.f312598a.invoke(f10, e10) == t.TERMINATE) {
                throw new w(f10);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(File file, IOException iOException) throws w {
            c(file, iOException);
            return Unit.f312394a;
        }
    }

    public static final boolean Q(@NotNull File file, @NotNull File target, boolean z10, @NotNull Function2<? super File, ? super IOException, ? extends t> onError) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (!file.exists()) {
            return onError.invoke(file, new s(file, null, "The source file doesn't exist.", 2, null)) != t.TERMINATE;
        }
        try {
            for (File file2 : o.P(file).k(new b(onError))) {
                if (file2.exists()) {
                    File file3 = new File(target, q0(file2, file));
                    if (file3.exists() && (!file2.isDirectory() || !file3.isDirectory())) {
                        if (z10) {
                            if (file3.isDirectory()) {
                                if (!Y(file3)) {
                                }
                            } else if (!file3.delete()) {
                            }
                        }
                        if (onError.invoke(file3, new h(file2, file3, "The destination file already exists.")) == t.TERMINATE) {
                            return false;
                        }
                    }
                    if (file2.isDirectory()) {
                        file3.mkdirs();
                    } else {
                        boolean z11 = z10;
                        if (T(file2, file3, z11, 0, 4, null).length() != file2.length() && onError.invoke(file2, new IOException("Source file wasn't copied completely, length of destination file differs.")) == t.TERMINATE) {
                            return false;
                        }
                        z10 = z11;
                    }
                } else if (onError.invoke(file2, new s(file2, null, "The source file doesn't exist.", 2, null)) == t.TERMINATE) {
                    return false;
                }
            }
            return true;
        } catch (w unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean R(File file, File file2, boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function2 = a.f312597a;
        }
        return Q(file, file2, z10, function2);
    }

    @NotNull
    public static final File S(@NotNull File file, @NotNull File target, boolean z10, int i10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        if (!file.exists()) {
            boolean z11 = true & false;
            throw new s(file, null, "The source file doesn't exist.", 2, null);
        }
        if (target.exists()) {
            if (!z10) {
                throw new h(file, target, "The destination file already exists.");
            }
            if (!target.delete()) {
                throw new h(file, target, "Tried to overwrite the destination, but failed to delete it.");
            }
        }
        if (file.isDirectory()) {
            if (target.mkdirs()) {
                return target;
            }
            throw new j(file, target, "Failed to create target directory.");
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                kotlin.io.b.k(fileInputStream, fileOutputStream, i10);
                c.a(fileOutputStream, null);
                c.a(fileInputStream, null);
                return target;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                c.a(fileInputStream, th4);
                throw th5;
            }
        }
    }

    public static /* synthetic */ File T(File file, File file2, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 8192;
        }
        return S(file, file2, z10, i10);
    }

    @kotlin.l(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    @NotNull
    public static final File U(@NotNull String prefix, @Nullable String str, @Nullable File file) throws IOException {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        fileCreateTempFile.delete();
        if (fileCreateTempFile.mkdir()) {
            Intrinsics.checkNotNull(fileCreateTempFile);
            return fileCreateTempFile;
        }
        throw new IOException("Unable to create temporary directory " + fileCreateTempFile + '.');
    }

    public static /* synthetic */ File V(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return U(str, str2, file);
    }

    @kotlin.l(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    @NotNull
    public static final File W(@NotNull String prefix, @Nullable String str, @Nullable File file) throws IOException {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        File fileCreateTempFile = File.createTempFile(prefix, str, file);
        Intrinsics.checkNotNullExpressionValue(fileCreateTempFile, "createTempFile(...)");
        return fileCreateTempFile;
    }

    public static /* synthetic */ File X(String str, String str2, File file, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "tmp";
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            file = null;
        }
        return W(str, str2, file);
    }

    public static boolean Y(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : o.O(file)) {
                if ((!file2.delete() && file2.exists()) || !z10) {
                    z10 = false;
                }
            }
            return z10;
        }
    }

    public static final boolean Z(@NotNull File file, @NotNull File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        i iVarF = m.f(file);
        i iVarF2 = m.f(other);
        if (iVarF2.i()) {
            return Intrinsics.areEqual(file, other);
        }
        int iH = iVarF.h() - iVarF2.h();
        if (iH < 0) {
            return false;
        }
        return iVarF.g().subList(iH, iVarF.h()).equals(iVarF2.g());
    }

    public static final boolean a0(@NotNull File file, @NotNull String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return Z(file, new File(other));
    }

    @NotNull
    public static String b0(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.q5(name, '.', "");
    }

    @NotNull
    public static final String c0(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        char c10 = File.separatorChar;
        if (c10 != '/') {
            String path = file.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            return StringsKt.j2(path, c10, '/', false, 4, null);
        }
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        return path2;
    }

    @NotNull
    public static String d0(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.B5(name, ".", null, 2, null);
    }

    @NotNull
    public static File e0(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        i iVarF = m.f(file);
        File fileE = iVarF.e();
        List<File> listF0 = f0(iVarF.g());
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        return l0(fileE, CollectionsKt.joinToString$default(listF0, separator, null, null, 0, null, null, 62, null));
    }

    private static final List<File> f0(List<? extends File> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!Intrinsics.areEqual(name, ".")) {
                if (!Intrinsics.areEqual(name, "..")) {
                    arrayList.add(file);
                } else if (arrayList.isEmpty() || Intrinsics.areEqual(((File) CollectionsKt.last((List) arrayList)).getName(), "..")) {
                    arrayList.add(file);
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }
        return arrayList;
    }

    private static final i g0(i iVar) {
        return new i(iVar.e(), f0(iVar.g()));
    }

    @NotNull
    public static final File h0(@NotNull File file, @NotNull File base) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        return new File(q0(file, base));
    }

    @Nullable
    public static final File i0(@NotNull File file, @NotNull File base) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String strR0 = r0(file, base);
        if (strR0 != null) {
            return new File(strR0);
        }
        return null;
    }

    @NotNull
    public static final File j0(@NotNull File file, @NotNull File base) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String strR0 = r0(file, base);
        if (strR0 != null) {
            file = new File(strR0);
        }
        return file;
    }

    @NotNull
    public static final File k0(@NotNull File file, @NotNull File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        if (m.d(relative)) {
            return relative;
        }
        String string = file.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (string.length() != 0) {
            char c10 = File.separatorChar;
            if (!StringsKt.a3(string, c10, false, 2, null)) {
                return new File(string + c10 + relative);
            }
        }
        return new File(string + relative);
    }

    @NotNull
    public static File l0(@NotNull File file, @NotNull String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return k0(file, new File(relative));
    }

    @NotNull
    public static final File m0(@NotNull File file, @NotNull File relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        i iVarF = m.f(file);
        return k0(k0(iVarF.e(), iVarF.h() == 0 ? new File("..") : iVarF.j(0, iVarF.h() - 1)), relative);
    }

    @NotNull
    public static final File n0(@NotNull File file, @NotNull String relative) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(relative, "relative");
        return m0(file, new File(relative));
    }

    public static final boolean o0(@NotNull File file, @NotNull File other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        i iVarF = m.f(file);
        i iVarF2 = m.f(other);
        if (Intrinsics.areEqual(iVarF.e(), iVarF2.e()) && iVarF.h() >= iVarF2.h()) {
            return iVarF.g().subList(0, iVarF2.h()).equals(iVarF2.g());
        }
        return false;
    }

    public static boolean p0(@NotNull File file, @NotNull String other) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return o0(file, new File(other));
    }

    @NotNull
    public static final String q0(@NotNull File file, @NotNull File base) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(base, "base");
        String strR0 = r0(file, base);
        if (strR0 != null) {
            return strR0;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + '.');
    }

    private static final String r0(File file, File file2) throws IOException {
        i iVarG0 = g0(m.f(file));
        i iVarG1 = g0(m.f(file2));
        if (!Intrinsics.areEqual(iVarG0.e(), iVarG1.e())) {
            return null;
        }
        int iH = iVarG1.h();
        int iH2 = iVarG0.h();
        int iMin = Math.min(iH2, iH);
        int i10 = 0;
        while (i10 < iMin && Intrinsics.areEqual(iVarG0.g().get(i10), iVarG1.g().get(i10))) {
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        int i11 = iH - 1;
        if (i10 <= i11) {
            while (!Intrinsics.areEqual(iVarG1.g().get(i11).getName(), "..")) {
                sb2.append("..");
                if (i11 != i10) {
                    sb2.append(File.separatorChar);
                }
                if (i11 != i10) {
                    i11--;
                }
            }
            return null;
        }
        if (i10 < iH2) {
            if (i10 < iH) {
                sb2.append(File.separatorChar);
            }
            List listDrop = CollectionsKt.drop(iVarG0.g(), i10);
            String separator = File.separator;
            Intrinsics.checkNotNullExpressionValue(separator, "separator");
            CollectionsKt___CollectionsKt.joinTo(listDrop, sb2, (124 & 2) != 0 ? ", " : separator, (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null);
        }
        return sb2.toString();
    }
}
