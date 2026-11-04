package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class t2<ElementKlass, Element extends ElementKlass> extends x<Element, Element[], ArrayList<Element>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final kotlin.reflect.d<ElementKlass> f316017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f316018c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(@NotNull kotlin.reflect.d<ElementKlass> kClass, @NotNull KSerializer<Element> eSerializer) {
        super(eSerializer, null);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f316017b = kClass;
        this.f316018c = new d(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.x, kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f316018c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> b() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull ArrayList<Element> arrayList, int i10) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.ensureCapacity(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public Iterator<Element> e(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return kotlin.jvm.internal.i.a(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int f(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.x
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(@NotNull ArrayList<Element> arrayList, int i10, Element element) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        arrayList.add(i10, element);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public ArrayList<Element> l(@NotNull Element[] elementArr) {
        Intrinsics.checkNotNullParameter(elementArr, "<this>");
        return new ArrayList<>(ArraysKt.asList(elementArr));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Element[] m(@NotNull ArrayList<Element> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        return (Element[]) e2.u(arrayList, this.f316017b);
    }
}
