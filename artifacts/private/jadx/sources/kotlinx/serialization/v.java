package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.j1;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@i
@SourceDebugExtension({"SMAP\nSealedSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 6 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,154:1\n1550#2:155\n1252#2,4:165\n53#3:156\n80#3,6:157\n465#4:163\n415#4:164\n82#5:169\n216#6,2:170\n*S KotlinDebug\n*F\n+ 1 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n130#1:155\n140#1:165,4\n131#1:156\n131#1:157,6\n140#1:163\n140#1:164\n151#1:169\n109#1:170,2\n*E\n"})
public final class v<T> extends kotlinx.serialization.internal.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<T> f316114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<? extends Annotation> f316115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f316116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Map<kotlin.reflect.d<? extends T>, KSerializer<? extends T>> f316117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Map<String, KSerializer<? extends T>> f316118e;

    @SourceDebugExtension({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n+ 2 SealedSerializer.kt\nkotlinx/serialization/SealedClassSerializer\n*L\n1#1,1552:1\n130#2:1553\n*E\n"})
    public static final class a implements Grouping<Map.Entry<? extends kotlin.reflect.d<? extends T>, ? extends KSerializer<? extends T>>, String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f316119a;

        public a(Iterable iterable) {
            this.f316119a = iterable;
        }

        @Override // kotlin.collections.Grouping
        public String keyOf(Map.Entry<? extends kotlin.reflect.d<? extends T>, ? extends KSerializer<? extends T>> entry) {
            return entry.getValue().getDescriptor().getSerialName();
        }

        @Override // kotlin.collections.Grouping
        public Iterator<Map.Entry<? extends kotlin.reflect.d<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
            return this.f316119a.iterator();
        }
    }

    public v(@NotNull final String serialName, @NotNull kotlin.reflect.d<T> baseClass, @NotNull kotlin.reflect.d<? extends T>[] subclasses, @NotNull KSerializer<? extends T>[] subclassSerializers) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.f316114a = baseClass;
        this.f316115b = CollectionsKt.emptyList();
        this.f316116c = kotlin.g0.b(kotlin.j0.PUBLICATION, new Function0() { // from class: kotlinx.serialization.s
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return v.j(serialName, this);
            }
        });
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + f().Q() + " should be marked @Serializable");
        }
        Map<kotlin.reflect.d<? extends T>, KSerializer<? extends T>> map = MapsKt.toMap(ArraysKt.zip(subclasses, subclassSerializers));
        this.f316117d = map;
        Grouping aVar = new a(map.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> itSourceIterator = aVar.sourceIterator();
        while (itSourceIterator.hasNext()) {
            T next = itSourceIterator.next();
            Object objKeyOf = aVar.keyOf(next);
            Object obj = linkedHashMap.get(objKeyOf);
            if (obj == null) {
                linkedHashMap.containsKey(objKeyOf);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) objKeyOf;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + f() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(objKeyOf, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.f316118e = linkedHashMap2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor j(String str, final v vVar) {
        return kotlinx.serialization.descriptors.k.h(str, kotlinx.serialization.descriptors.d.b.f315830a, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.k(this.f316112a, (kotlinx.serialization.descriptors.a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(final v vVar, kotlinx.serialization.descriptors.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "type", hk.a.K(q1.f312784a).getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "value", kotlinx.serialization.descriptors.k.h("kotlinx.serialization.Sealed<" + vVar.f().Q() + kotlin.text.b0.f313281f, kotlinx.serialization.descriptors.l.a.f315859a, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.l(this.f316113a, (kotlinx.serialization.descriptors.a) obj);
            }
        }), null, false, 12, null);
        buildSerialDescriptor.l(vVar.f316115b);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(v vVar, kotlinx.serialization.descriptors.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry<String, KSerializer<? extends T>> entry : vVar.f316118e.entrySet()) {
            kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, entry.getKey(), entry.getValue().getDescriptor(), null, false, 12, null);
        }
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.internal.b
    @Nullable
    public e<T> d(@NotNull kotlinx.serialization.encoding.d decoder, @Nullable String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        KSerializer<? extends T> kSerializer = this.f316118e.get(str);
        return kSerializer != null ? kSerializer : super.d(decoder, str);
    }

    @Override // kotlinx.serialization.internal.b
    @Nullable
    public d0<T> e(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer<? extends T> kSerializer = this.f316117d.get(j1.d(value.getClass()));
        KSerializer<? extends T> kSerializerE = kSerializer != null ? kSerializer : super.e(encoder, value);
        if (kSerializerE != null) {
            return kSerializerE;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.b
    @NotNull
    public kotlin.reflect.d<T> f() {
        return this.f316114a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f316116c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @a1
    public v(@NotNull String serialName, @NotNull kotlin.reflect.d<T> baseClass, @NotNull kotlin.reflect.d<? extends T>[] subclasses, @NotNull KSerializer<? extends T>[] subclassSerializers, @NotNull Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f316115b = ArraysKt.asList(classAnnotations);
    }
}
