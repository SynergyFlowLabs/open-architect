package kotlinx.serialization;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class p<T> extends kotlinx.serialization.internal.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<T> f316106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private List<? extends Annotation> f316107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.f0 f316108c;

    public p(@NotNull kotlin.reflect.d<T> baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f316106a = baseClass;
        this.f316107b = CollectionsKt.emptyList();
        this.f316108c = kotlin.g0.b(kotlin.j0.PUBLICATION, new Function0() { // from class: kotlinx.serialization.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p.i(this.f316105a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor i(final p pVar) {
        return kotlinx.serialization.descriptors.b.e(kotlinx.serialization.descriptors.k.h("kotlinx.serialization.Polymorphic", kotlinx.serialization.descriptors.d.a.f315829a, new SerialDescriptor[0], new Function1() { // from class: kotlinx.serialization.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return p.j(this.f316104a, (kotlinx.serialization.descriptors.a) obj);
            }
        }), pVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(p pVar, kotlinx.serialization.descriptors.a buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "type", hk.a.K(q1.f312784a).getDescriptor(), null, false, 12, null);
        kotlinx.serialization.descriptors.a.b(buildSerialDescriptor, "value", kotlinx.serialization.descriptors.k.i("kotlinx.serialization.Polymorphic<" + pVar.f().Q() + kotlin.text.b0.f313281f, kotlinx.serialization.descriptors.l.a.f315859a, new SerialDescriptor[0], null, 8, null), null, false, 12, null);
        buildSerialDescriptor.l(pVar.f316107b);
        return Unit.f312394a;
    }

    @Override // kotlinx.serialization.internal.b
    @NotNull
    public kotlin.reflect.d<T> f() {
        return this.f316106a;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f316108c.getValue();
    }

    @NotNull
    public String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + f() + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @a1
    public p(@NotNull kotlin.reflect.d<T> baseClass, @NotNull Annotation[] classAnnotations) {
        this(baseClass);
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f316107b = ArraysKt.asList(classAnnotations);
    }
}
