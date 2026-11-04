package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nPluginGeneratedSerialDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n+ 2 Platform.kt\nkotlinx/serialization/internal/PlatformKt\n+ 3 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,134:1\n16#2:135\n21#2:136\n16#2:137\n16#2:138\n107#3,10:139\n11228#4:149\n11563#4,3:150\n*S KotlinDebug\n*F\n+ 1 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptor\n*L\n76#1:135\n79#1:136\n81#1:137\n82#1:138\n93#1:139,10\n40#1:149\n40#1:150,3\n*E\n"})
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f315877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final p0<?> f315878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f315879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f315880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final String[] f315881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<Annotation>[] f315882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private List<Annotation> f315883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final boolean[] f315884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private Map<String, Integer> f315885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f315886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f315887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f315888l;

    public PluginGeneratedSerialDescriptor(@NotNull String serialName, @Nullable p0<?> p0Var, int i10) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        this.f315877a = serialName;
        this.f315878b = p0Var;
        this.f315879c = i10;
        this.f315880d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f315881e = strArr;
        int i12 = this.f315879c;
        this.f315882f = new List[i12];
        this.f315884h = new boolean[i12];
        this.f315885i = MapsKt.emptyMap();
        kotlin.j0 j0Var = kotlin.j0.PUBLICATION;
        this.f315886j = kotlin.g0.b(j0Var, new Function0() { // from class: kotlinx.serialization.internal.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PluginGeneratedSerialDescriptor.l(this.f315933a);
            }
        });
        this.f315887k = kotlin.g0.b(j0Var, new Function0() { // from class: kotlinx.serialization.internal.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PluginGeneratedSerialDescriptor.r(this.f315941a);
            }
        });
        this.f315888l = kotlin.g0.b(j0Var, new Function0() { // from class: kotlinx.serialization.internal.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(PluginGeneratedSerialDescriptor.h(this.f315951a));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int h(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        return l2.c(pluginGeneratedSerialDescriptor, pluginGeneratedSerialDescriptor.n());
    }

    public static /* synthetic */ void j(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor, String str, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
            int i11 = 7 << 0;
        }
        pluginGeneratedSerialDescriptor.i(str, z10);
    }

    private final Map<String, Integer> k() {
        HashMap map = new HashMap();
        int length = this.f315881e.length;
        for (int i10 = 0; i10 < length; i10++) {
            map.put(this.f315881e[i10], Integer.valueOf(i10));
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer[] l(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        KSerializer<?>[] kSerializerArrChildSerializers;
        p0<?> p0Var = pluginGeneratedSerialDescriptor.f315878b;
        return (p0Var == null || (kSerializerArrChildSerializers = p0Var.childSerializers()) == null) ? m2.f315974a : kSerializerArrChildSerializers;
    }

    private final KSerializer<?>[] m() {
        return (KSerializer[]) this.f315886j.getValue();
    }

    private final int o() {
        return ((Number) this.f315888l.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor[] r(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        ArrayList arrayList;
        KSerializer<?>[] kSerializerArrTypeParametersSerializers;
        p0<?> p0Var = pluginGeneratedSerialDescriptor.f315878b;
        if (p0Var == null || (kSerializerArrTypeParametersSerializers = p0Var.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
            for (KSerializer<?> kSerializer : kSerializerArrTypeParametersSerializers) {
                arrayList.add(kSerializer.getDescriptor());
            }
        }
        return f2.e(arrayList);
    }

    @Override // kotlinx.serialization.internal.n
    @NotNull
    public Set<String> a() {
        return this.f315885i.keySet();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PluginGeneratedSerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        if (!Intrinsics.areEqual(getSerialName(), serialDescriptor.getSerialName()) || !Arrays.equals(n(), ((PluginGeneratedSerialDescriptor) obj).n()) || getElementsCount() != serialDescriptor.getElementsCount()) {
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
        List<Annotation> listEmptyList = this.f315883g;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int i10) {
        List<Annotation> listEmptyList = this.f315882f[i10];
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return listEmptyList;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int i10) {
        return m()[i10].getDescriptor();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num = this.f315885i.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int i10) {
        return this.f315881e[i10];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int getElementsCount() {
        return this.f315879c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public kotlinx.serialization.descriptors.l getKind() {
        return kotlinx.serialization.descriptors.m.a.f315861a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.f315877a;
    }

    public int hashCode() {
        return o();
    }

    public final void i(@NotNull String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        String[] strArr = this.f315881e;
        int i10 = this.f315880d + 1;
        this.f315880d = i10;
        strArr[i10] = name;
        this.f315884h[i10] = z10;
        int i11 = 3 & 0;
        this.f315882f[i10] = null;
        if (i10 == this.f315879c - 1) {
            this.f315885i = k();
        }
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int i10) {
        return this.f315884h[i10];
    }

    @NotNull
    public final SerialDescriptor[] n() {
        return (SerialDescriptor[]) this.f315887k.getValue();
    }

    public final void p(@NotNull Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        List<Annotation> arrayList = this.f315882f[this.f315880d];
        if (arrayList == null) {
            arrayList = new ArrayList<>(1);
            this.f315882f[this.f315880d] = arrayList;
        }
        arrayList.add(annotation);
    }

    public final void q(@NotNull Annotation a10) {
        Intrinsics.checkNotNullParameter(a10, "a");
        if (this.f315883g == null) {
            this.f315883g = new ArrayList(1);
        }
        List<Annotation> list = this.f315883g;
        Intrinsics.checkNotNull(list);
        list.add(a10);
    }

    @NotNull
    public String toString() {
        return l2.d(this);
    }

    public /* synthetic */ PluginGeneratedSerialDescriptor(String str, p0 p0Var, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : p0Var, i10);
    }
}
