package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f315818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f315819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private List<? extends Annotation> f315820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<String> f315821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<String> f315822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<SerialDescriptor> f315823f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final List<List<Annotation>> f315824g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<Boolean> f315825h;

    public a(@NotNull String serialName) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f315818a = serialName;
        this.f315820c = CollectionsKt.emptyList();
        this.f315821d = new ArrayList();
        this.f315822e = new HashSet();
        this.f315823f = new ArrayList();
        this.f315824g = new ArrayList();
        this.f315825h = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, String str, SerialDescriptor serialDescriptor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        aVar.a(str, serialDescriptor, list, z10);
    }

    @kotlinx.serialization.g
    public static /* synthetic */ void d() {
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "isNullable inside buildSerialDescriptor is deprecated. Please use SerialDescriptor.nullable extension on a builder result.")
    @kotlinx.serialization.g
    public static /* synthetic */ void k() {
    }

    public final void a(@NotNull String elementName, @NotNull SerialDescriptor descriptor, @NotNull List<? extends Annotation> annotations, boolean z10) {
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        if (this.f315822e.add(elementName)) {
            this.f315821d.add(elementName);
            this.f315823f.add(descriptor);
            this.f315824g.add(annotations);
            this.f315825h.add(Boolean.valueOf(z10));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f315818a).toString());
    }

    @NotNull
    public final List<Annotation> c() {
        return this.f315820c;
    }

    @NotNull
    public final List<List<Annotation>> e() {
        return this.f315824g;
    }

    @NotNull
    public final List<SerialDescriptor> f() {
        return this.f315823f;
    }

    @NotNull
    public final List<String> g() {
        return this.f315821d;
    }

    @NotNull
    public final List<Boolean> h() {
        return this.f315825h;
    }

    @NotNull
    public final String i() {
        return this.f315818a;
    }

    public final boolean j() {
        return this.f315819b;
    }

    public final void l(@NotNull List<? extends Annotation> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.f315820c = list;
    }

    public final void m(boolean z10) {
        this.f315819b = z10;
    }
}
