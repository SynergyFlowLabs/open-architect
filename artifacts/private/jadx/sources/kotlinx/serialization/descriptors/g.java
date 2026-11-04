package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.f0;
import kotlin.g0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.internal.f2;
import kotlinx.serialization.internal.l2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 5 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,393:1\n37#2:394\n36#2,3:395\n37#2:398\n36#2,3:399\n1563#3:402\n1634#3,3:403\n16#4:406\n16#4:407\n16#4:408\n21#4:409\n107#5,10:410\n*S KotlinDebug\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorImpl\n*L\n368#1:394\n368#1:395,3\n370#1:398\n370#1:399,3\n372#1:402\n372#1:403,3\n376#1:406\n378#1:407\n379#1:408\n380#1:409\n383#1:410,10\n*E\n"})
public final class g implements SerialDescriptor, kotlinx.serialization.internal.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f315841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final l f315842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f315843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<Annotation> f315844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Set<String> f315845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final String[] f315846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor[] f315847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final List<Annotation>[] f315848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final boolean[] f315849i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Map<String, Integer> f315850j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor[] f315851k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final f0 f315852l;

    public g(@NotNull String serialName, @NotNull l kind, int i10, @NotNull List<? extends SerialDescriptor> typeParameters, @NotNull a builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f315841a = serialName;
        this.f315842b = kind;
        this.f315843c = i10;
        this.f315844d = builder.c();
        this.f315845e = CollectionsKt.toHashSet(builder.g());
        String[] strArr = (String[]) builder.g().toArray(new String[0]);
        this.f315846f = strArr;
        this.f315847g = f2.e(builder.f());
        this.f315848h = (List[]) builder.e().toArray(new List[0]);
        this.f315849i = CollectionsKt.toBooleanArray(builder.h());
        Iterable<IndexedValue> iterableWithIndex = ArraysKt.withIndex(strArr);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10));
        for (IndexedValue indexedValue : iterableWithIndex) {
            arrayList.add(TuplesKt.to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex())));
        }
        this.f315850j = MapsKt.toMap(arrayList);
        this.f315851k = f2.e(typeParameters);
        this.f315852l = g0.c(new Function0() { // from class: kotlinx.serialization.descriptors.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(g.f(this.f315840a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(g gVar) {
        return l2.c(gVar, gVar.f315851k);
    }

    private final int g() {
        return ((Number) this.f315852l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.internal.n
    @NotNull
    public Set<String> a() {
        return this.f315845e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(this.f315851k, ((g) obj).f315851k) || getElementsCount() != serialDescriptor.getElementsCount()) {
            return false;
        }
        int elementsCount = getElementsCount();
        for (int i10 = 0; i10 < elementsCount; i10++) {
            if (!Intrinsics.areEqual(getElementDescriptor(i10).getSerialName(), serialDescriptor.getElementDescriptor(i10).getSerialName()) || !Intrinsics.areEqual(getElementDescriptor(i10).getKind(), serialDescriptor.getElementDescriptor(i10).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.f315844d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int i10) {
        return this.f315848h[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int i10) {
        return this.f315847g[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.f315850j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int i10) {
        return this.f315846f[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.f315843c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public l getKind() {
        return this.f315842b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.f315841a;
    }

    public int hashCode() {
        return g();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        return this.f315849i[i10];
    }

    @NotNull
    public String toString() {
        return l2.d(this);
    }
}
