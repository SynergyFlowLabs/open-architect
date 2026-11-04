package okio.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.l0;
import kotlin.text.StringsKt;
import okio.b1;
import okio.r0;
import okio.t;
import okio.u;
import okio.v;
import okio.z0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,215:1\n766#2:216\n857#2,2:217\n1549#2:219\n1620#2,3:220\n766#2:223\n857#2,2:224\n1549#2:226\n1620#2,3:227\n1603#2,9:230\n1855#2:239\n1856#2:241\n1612#2:242\n1603#2,9:243\n1855#2:252\n1856#2:254\n1612#2:255\n1#3:240\n1#3:253\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n75#1:216\n75#1:217,2\n76#1:219\n76#1:220,3\n91#1:223\n91#1:224,2\n92#1:226\n92#1:227,3\n178#1:230,9\n178#1:239\n178#1:241\n178#1:242\n179#1:243,9\n179#1:252\n179#1:254\n179#1:255\n178#1:240\n179#1:253\n*E\n"})
public final class k extends v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final a f334959h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final r0 f334960i = r0.a.h(r0.f335070b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final ClassLoader f334961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final v f334962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final f0 f334963g;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(r0 r0Var) {
            return !StringsKt.L1(r0Var.t(), ".class", true);
        }

        @NotNull
        public final r0 b() {
            return k.f334960i;
        }

        @NotNull
        public final r0 d(@NotNull r0 r0Var, @NotNull r0 base) {
            Intrinsics.checkNotNullParameter(r0Var, "<this>");
            Intrinsics.checkNotNullParameter(base, "base");
            return b().D(StringsKt.j2(StringsKt.d4(r0Var.toString(), base.toString()), '\\', '/', false, 4, null));
        }

        private a() {
        }
    }

    static final class b extends l0 implements Function0<List<? extends Pair<? extends v, ? extends r0>>> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<Pair<v, r0>> invoke() {
            k kVar = k.this;
            return kVar.T(kVar.f334961e);
        }
    }

    static final class c extends l0 implements Function1<l, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f334965a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(@NotNull l entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return Boolean.valueOf(k.f334959h.c(entry.b()));
        }
    }

    public /* synthetic */ k(ClassLoader classLoader, boolean z10, v vVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classLoader, z10, (i10 & 4) != 0 ? v.f335116b : vVar);
    }

    private final r0 R(r0 r0Var) {
        return f334960i.M(r0Var, true);
    }

    private final List<Pair<v, r0>> S() {
        return (List) this.f334963g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pair<v, r0>> T(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            Intrinsics.checkNotNull(url);
            Pair<v, r0> pairU = U(url);
            if (pairU != null) {
                arrayList.add(pairU);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        Intrinsics.checkNotNullExpressionValue(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            Intrinsics.checkNotNull(url2);
            Pair<v, r0> pairV = V(url2);
            if (pairV != null) {
                arrayList2.add(pairV);
            }
        }
        return CollectionsKt.plus((Collection) arrayList, (Iterable) arrayList2);
    }

    private final Pair<v, r0> U(URL url) {
        if (Intrinsics.areEqual(url.getProtocol(), com.facebook.share.internal.k.f101891c)) {
            return TuplesKt.to(this.f334962f, r0.a.g(r0.f335070b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final Pair<v, r0> V(URL url) {
        int iG3;
        String string = url.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        if (StringsKt.u2(string, "jar:file:", false, 2, null) && (iG3 = StringsKt.G3(string, "!", 0, false, 6, null)) != -1) {
            r0.a aVar = r0.f335070b;
            String strSubstring = string.substring(4, iG3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return TuplesKt.to(m.f(r0.a.g(aVar, new File(URI.create(strSubstring)), false, 1, null), this.f334962f, c.f334965a), f334960i);
        }
        return null;
    }

    private final String W(r0 r0Var) {
        return R(r0Var).z(f334960i).toString();
    }

    @Override // okio.v
    @Nullable
    public u E(@NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        if (!f334959h.c(path)) {
            return null;
        }
        String strW = W(path);
        for (Pair<v, r0> pair : S()) {
            u uVarE = pair.component1().E(pair.component2().D(strW));
            if (uVarE != null) {
                return uVarE;
            }
        }
        return null;
    }

    @Override // okio.v
    @NotNull
    public t F(@NotNull r0 file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!f334959h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        String strW = W(file);
        Iterator<Pair<v, r0>> it = S().iterator();
        while (it.hasNext()) {
            Pair<v, r0> next = it.next();
            try {
                return next.component1().F(next.component2().D(strW));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.v
    @NotNull
    public t H(@NotNull r0 file, boolean z10, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.v
    @NotNull
    public z0 K(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.v
    @NotNull
    public b1 M(@NotNull r0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        if (!f334959h.c(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        r0 r0Var = f334960i;
        URL resource = this.f334961e.getResource(r0.R(r0Var, file, false, 2, null).z(r0Var).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return okio.l0.u(inputStream);
    }

    @Override // okio.v
    @NotNull
    public z0 e(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.v
    public void g(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.v
    @NotNull
    public r0 h(@NotNull r0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return R(path);
    }

    @Override // okio.v
    public void n(@NotNull r0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.v
    public void p(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.v
    public void r(@NotNull r0 path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.v
    @NotNull
    public List<r0> y(@NotNull r0 dir) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strW = W(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (Pair<v, r0> pair : S()) {
            v vVarComponent1 = pair.component1();
            r0 r0VarComponent2 = pair.component2();
            try {
                List<r0> listY = vVarComponent1.y(r0VarComponent2.D(strW));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listY) {
                    if (f334959h.c((r0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f334959h.d((r0) it.next(), r0VarComponent2));
                }
                CollectionsKt.addAll(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return CollectionsKt.toList(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // okio.v
    @Nullable
    public List<r0> z(@NotNull r0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        String strW = W(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Pair<v, r0>> it = S().iterator();
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            Pair<v, r0> next = it.next();
            v vVarComponent1 = next.component1();
            r0 r0VarComponent2 = next.component2();
            List<r0> listZ = vVarComponent1.z(r0VarComponent2.D(strW));
            if (listZ != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listZ) {
                    if (f334959h.c((r0) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(f334959h.d((r0) it2.next(), r0VarComponent2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                CollectionsKt.addAll(linkedHashSet, arrayList);
                z10 = true;
            }
        }
        if (z10) {
            return CollectionsKt.toList(linkedHashSet);
        }
        return null;
    }

    public k(@NotNull ClassLoader classLoader, boolean z10, @NotNull v systemFileSystem) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        Intrinsics.checkNotNullParameter(systemFileSystem, "systemFileSystem");
        this.f334961e = classLoader;
        this.f334962f = systemFileSystem;
        this.f334963g = g0.c(new b());
        if (z10) {
            S().size();
        }
    }
}
