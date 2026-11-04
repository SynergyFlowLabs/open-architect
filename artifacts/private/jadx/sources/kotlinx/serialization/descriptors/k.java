package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.q0;
import kotlin.reflect.s;
import kotlin.text.StringsKt;
import kotlinx.serialization.internal.s0;
import kotlinx.serialization.internal.s2;
import kotlinx.serialization.internal.u2;
import kotlinx.serialization.m0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSerialDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerialDescriptors.kt\nkotlinx/serialization/descriptors/SerialDescriptorsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"})
public final class k {
    @NotNull
    public static final SerialDescriptor c(@NotNull String serialName, @NotNull e kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (StringsKt.w3(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        return s2.a(serialName, kind);
    }

    @NotNull
    public static final SerialDescriptor d(@NotNull String serialName, @NotNull SerialDescriptor original) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(original, "original");
        if (StringsKt.w3(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (!Intrinsics.areEqual(serialName, original.getSerialName())) {
            if (original.getKind() instanceof e) {
                s2.d(serialName);
            }
            return new n(serialName, original);
        }
        throw new IllegalArgumentException(("The name of the wrapped descriptor (" + serialName + ") cannot be the same as the name of the original descriptor (" + original.getSerialName() + ')').toString());
    }

    @NotNull
    public static final SerialDescriptor e(@NotNull String serialName, @NotNull SerialDescriptor[] typeParameters, @NotNull Function1<? super a, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        if (StringsKt.w3(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        a aVar = new a(serialName);
        builderAction.invoke(aVar);
        return new g(serialName, m.a.f315861a, aVar.g().size(), ArraysKt.toList(typeParameters), aVar);
    }

    public static /* synthetic */ SerialDescriptor f(String str, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: kotlinx.serialization.descriptors.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k.g((a) obj2);
                }
            };
        }
        return e(str, serialDescriptorArr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return Unit.f312394a;
    }

    @kotlinx.serialization.i
    @NotNull
    public static final SerialDescriptor h(@NotNull String serialName, @NotNull l kind, @NotNull SerialDescriptor[] typeParameters, @NotNull Function1<? super a, Unit> builder) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (StringsKt.w3(serialName)) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (Intrinsics.areEqual(kind, m.a.f315861a)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        a aVar = new a(serialName);
        builder.invoke(aVar);
        return new g(serialName, kind, aVar.g().size(), ArraysKt.toList(typeParameters), aVar);
    }

    public static /* synthetic */ SerialDescriptor i(String str, l lVar, SerialDescriptor[] serialDescriptorArr, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: kotlinx.serialization.descriptors.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return k.j((a) obj2);
                }
            };
        }
        return h(str, lVar, serialDescriptorArr, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return Unit.f312394a;
    }

    public static final /* synthetic */ <T> void k(a aVar, String elementName, List<? extends Annotation> annotations, boolean z10) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.simple");
        aVar.a(elementName, m0.k(null).getDescriptor(), annotations, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void l(a aVar, String elementName, List annotations, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotations = CollectionsKt.emptyList();
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.simple");
        aVar.a(elementName, m0.k(null).getDescriptor(), annotations, z10);
    }

    @NotNull
    public static final SerialDescriptor m(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof u2) {
            serialDescriptor = ((u2) serialDescriptor).e();
        }
        return serialDescriptor;
    }

    @kotlinx.serialization.g
    public static /* synthetic */ void n(SerialDescriptor serialDescriptor) {
    }

    @NotNull
    public static final SerialDescriptor o(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        return serialDescriptor.isNullable() ? serialDescriptor : new u2(serialDescriptor);
    }

    public static /* synthetic */ void p(SerialDescriptor serialDescriptor) {
    }

    @kotlinx.serialization.g
    public static final /* synthetic */ <T> SerialDescriptor q() {
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.simple");
        return r(m0.k(null).getDescriptor());
    }

    @kotlinx.serialization.g
    @NotNull
    public static final SerialDescriptor r(@NotNull SerialDescriptor elementDescriptor) {
        Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        return new kotlinx.serialization.internal.e(elementDescriptor);
    }

    @kotlinx.serialization.g
    public static final /* synthetic */ <K, V> SerialDescriptor s() {
        Intrinsics.reifiedOperationMarker(6, "K");
        q0.n("kotlinx.serialization.serializer.simple");
        SerialDescriptor descriptor = m0.k(null).getDescriptor();
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.Y4);
        q0.n("kotlinx.serialization.serializer.simple");
        return t(descriptor, m0.k(null).getDescriptor());
    }

    @kotlinx.serialization.g
    @NotNull
    public static final SerialDescriptor t(@NotNull SerialDescriptor keyDescriptor, @NotNull SerialDescriptor valueDescriptor) {
        Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor");
        Intrinsics.checkNotNullParameter(valueDescriptor, "valueDescriptor");
        return new kotlinx.serialization.internal.q0(keyDescriptor, valueDescriptor);
    }

    public static final /* synthetic */ <T> SerialDescriptor u() {
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.simple");
        return m0.k(null).getDescriptor();
    }

    @NotNull
    public static final SerialDescriptor v(@NotNull s type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return m0.k(type).getDescriptor();
    }

    @kotlinx.serialization.g
    public static final /* synthetic */ <T> SerialDescriptor w() {
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.f51379e5);
        q0.n("kotlinx.serialization.serializer.simple");
        return x(m0.k(null).getDescriptor());
    }

    @kotlinx.serialization.g
    @NotNull
    public static final SerialDescriptor x(@NotNull SerialDescriptor elementDescriptor) {
        Intrinsics.checkNotNullParameter(elementDescriptor, "elementDescriptor");
        return new s0(elementDescriptor);
    }
}
