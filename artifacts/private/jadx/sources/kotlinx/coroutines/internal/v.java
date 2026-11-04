package kotlinx.coroutines.internal;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,169:1\n85#1,5:170\n85#1,5:175\n139#1,13:191\n1#2:180\n1368#3:181\n1454#3,5:182\n1557#3:187\n1628#3,3:188\n1069#4,2:204\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n62#1:170,5\n69#1:175,5\n125#1:191,13\n107#1:181\n107#1:182,5\n109#1:187\n109#1:188,3\n161#1:204,2\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final v f315128a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final String f315129b = "META-INF/services/";

    private v() {
    }

    private final j0 a(Class<j0> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S b(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            return CollectionsKt.toList(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> f(URL url) throws IOException {
        String string = url.toString();
        if (!StringsKt.u2(string, "jar", false, 2, null)) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(FirebasePerfUrlConnection.openStream(url)));
            try {
                List<String> listG = f315128a.g(bufferedReader);
                kotlin.io.c.a(bufferedReader, null);
                return listG;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.c.a(bufferedReader, th2);
                    throw th3;
                }
            }
        }
        String strW5 = StringsKt.w5(StringsKt.p5(string, "jar:file:", null, 2, null), '!', null, 2, null);
        String strP5 = StringsKt.p5(string, "!/", null, 2, null);
        JarFile jarFile = new JarFile(strW5, false);
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strP5)), "UTF-8"));
            try {
                List<String> listG2 = f315128a.g(bufferedReader2);
                kotlin.io.c.a(bufferedReader2, null);
                jarFile.close();
                return listG2;
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    kotlin.io.c.a(bufferedReader2, th4);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                try {
                    jarFile.close();
                    throw th7;
                } catch (Throwable th8) {
                    kotlin.p.a(th6, th8);
                    throw th6;
                }
            }
        }
    }

    private final List<String> g(BufferedReader bufferedReader) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return CollectionsKt.toList(linkedHashSet);
            }
            String string = StringsKt.E5(StringsKt.x5(line, "#", null, 2, null)).toString();
            int i10 = 4 | 0;
            for (int i11 = 0; i11 < string.length(); i11++) {
                char cCharAt = string.charAt(i11);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + string).toString());
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }

    private final <R> R h(JarFile jarFile, Function1<? super JarFile, ? extends R> function1) throws IOException {
        try {
            R rInvoke = function1.invoke(jarFile);
            kotlin.jvm.internal.h0.d(1);
            jarFile.close();
            kotlin.jvm.internal.h0.c(1);
            return rInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                try {
                    jarFile.close();
                    kotlin.jvm.internal.h0.c(1);
                    throw th3;
                } catch (Throwable th4) {
                    kotlin.p.a(th2, th4);
                    throw th2;
                }
            }
        }
    }

    @NotNull
    public final List<j0> d() {
        List<j0> listC;
        j0 j0Var;
        if (!w.a()) {
            return c(j0.class, j0.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            j0 j0Var2 = null;
            try {
                j0Var = (j0) j0.class.cast(Class.forName("kotlinx.coroutines.android.a", true, j0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                j0Var = null;
            }
            if (j0Var == null) {
                return c(j0.class, j0.class.getClassLoader());
            }
            arrayList.add(j0Var);
            try {
                j0Var2 = (j0) j0.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, j0.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            listC = arrayList;
            if (j0Var2 != null) {
                arrayList.add(j0Var2);
                listC = arrayList;
            }
            return listC;
        } catch (Throwable unused3) {
            listC = c(j0.class, j0.class.getClassLoader());
        }
    }

    @NotNull
    public final <S> List<S> e(@NotNull Class<S> cls, @NotNull ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(f315129b + cls.getName()));
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, f315128a.f((URL) it.next()));
        }
        Set set = CollectionsKt.toSet(arrayList);
        if (set.isEmpty()) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
        }
        Set set2 = set;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(f315128a.b((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }
}
