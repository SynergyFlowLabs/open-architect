package kotlinx.serialization.internal;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.a1
public final class t0<E> extends y<E, Set<? extends E>, HashSet<E>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final SerialDescriptor f316014b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(@NotNull KSerializer<E> eSerializer) {
        super(eSerializer);
        Intrinsics.checkNotNullParameter(eSerializer, "eSerializer");
        this.f316014b = new s0(eSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.internal.x, kotlinx.serialization.KSerializer, kotlinx.serialization.d0, kotlinx.serialization.e
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f316014b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public HashSet<E> b() {
        return new HashSet<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public int c(@NotNull HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void d(@NotNull HashSet<E> hashSet, int i10) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.x
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void o(@NotNull HashSet<E> hashSet, int i10, E e10) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        hashSet.add(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public HashSet<E> l(@NotNull Set<? extends E> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        HashSet<E> hashSet = set instanceof HashSet ? (HashSet) set : null;
        if (hashSet == null) {
            hashSet = new HashSet<>(set);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @NotNull
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public Set<E> m(@NotNull HashSet<E> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "<this>");
        return hashSet;
    }
}
