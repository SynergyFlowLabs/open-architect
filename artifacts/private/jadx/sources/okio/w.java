package okio;

import io.intercom.android.sdk.models.AttributeType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nForwardingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n1620#2,3:244\n1620#2,3:247\n*S KotlinDebug\n*F\n+ 1 ForwardingFileSystem.kt\nokio/ForwardingFileSystem\n*L\n166#1:244,3\n174#1:247,3\n*E\n"})
public abstract class w extends v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final v f335123e;

    static final class a extends kotlin.jvm.internal.l0 implements Function1<r0, r0> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r0 invoke(@NotNull r0 it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return w.this.P(it, "listRecursively");
        }
    }

    public w(@NotNull v delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f335123e = delegate;
    }

    @Override // okio.v
    @NotNull
    public Sequence<r0> B(@NotNull r0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        return kotlin.sequences.o.k1(this.f335123e.B(O(dir, "listRecursively", "dir"), z10), new a());
    }

    @Override // okio.v
    @Nullable
    public u E(@NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        u uVarE = this.f335123e.E(O(path, "metadataOrNull", "path"));
        if (uVarE == null) {
            return null;
        }
        return uVarE.i() == null ? uVarE : u.b(uVarE, false, false, P(uVarE.i(), "metadataOrNull"), null, null, null, null, null, com.planner5d.library.engine.input.f.b.U1, null);
    }

    @Override // okio.v
    @NotNull
    public t F(@NotNull r0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f335123e.F(O(file, "openReadOnly", com.facebook.share.internal.k.f101891c));
    }

    @Override // okio.v
    @NotNull
    public t H(@NotNull r0 file, boolean z10, boolean z11) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f335123e.H(O(file, "openReadWrite", com.facebook.share.internal.k.f101891c), z10, z11);
    }

    @Override // okio.v
    @NotNull
    public z0 K(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f335123e.K(O(file, "sink", com.facebook.share.internal.k.f101891c), z10);
    }

    @Override // okio.v
    @NotNull
    public b1 M(@NotNull r0 file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f335123e.M(O(file, "source", com.facebook.share.internal.k.f101891c));
    }

    @oj.i(name = "delegate")
    @NotNull
    public final v N() {
        return this.f335123e;
    }

    @NotNull
    public r0 O(@NotNull r0 path, @NotNull String functionName, @NotNull String parameterName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        Intrinsics.checkNotNullParameter(parameterName, "parameterName");
        return path;
    }

    @NotNull
    public r0 P(@NotNull r0 path, @NotNull String functionName) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return path;
    }

    @Override // okio.v
    @NotNull
    public z0 e(@NotNull r0 file, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(file, "file");
        return this.f335123e.e(O(file, "appendingSink", com.facebook.share.internal.k.f101891c), z10);
    }

    @Override // okio.v
    public void g(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f335123e.g(O(source, "atomicMove", "source"), O(target, "atomicMove", androidx.constraintlayout.core.motion.utils.v.a.M));
    }

    @Override // okio.v
    @NotNull
    public r0 h(@NotNull r0 path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        return P(this.f335123e.h(O(path, "canonicalize", "path")), "canonicalize");
    }

    @Override // okio.v
    public void n(@NotNull r0 dir, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        this.f335123e.n(O(dir, "createDirectory", "dir"), z10);
    }

    @Override // okio.v
    public void p(@NotNull r0 source, @NotNull r0 target) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f335123e.p(O(source, "createSymlink", "source"), O(target, "createSymlink", androidx.constraintlayout.core.motion.utils.v.a.M));
    }

    @Override // okio.v
    public void r(@NotNull r0 path, boolean z10) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f335123e.r(O(path, "delete", "path"), z10);
    }

    @NotNull
    public String toString() {
        return j1.d(getClass()).Q() + '(' + this.f335123e + ')';
    }

    @Override // okio.v
    @NotNull
    public List<r0> y(@NotNull r0 dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<r0> listY = this.f335123e.y(O(dir, AttributeType.LIST, "dir"));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listY.iterator();
        while (it.hasNext()) {
            arrayList.add(P((r0) it.next(), AttributeType.LIST));
        }
        CollectionsKt.sort(arrayList);
        return arrayList;
    }

    @Override // okio.v
    @Nullable
    public List<r0> z(@NotNull r0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        List<r0> listZ = this.f335123e.z(O(dir, "listOrNull", "dir"));
        if (listZ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listZ.iterator();
        while (it.hasNext()) {
            arrayList.add(P((r0) it.next(), "listOrNull"));
        }
        CollectionsKt.sort(arrayList);
        return arrayList;
    }
}
