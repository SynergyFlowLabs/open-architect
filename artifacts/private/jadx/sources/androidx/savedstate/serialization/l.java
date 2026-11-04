package androidx.savedstate.serialization;

import android.os.Parcelable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j1;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class l {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <T> T a(@NotNull j jVar, @NotNull kotlinx.serialization.e<? extends T> strategy) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        SerialDescriptor descriptor = strategy.getDescriptor();
        if (Intrinsics.areEqual(descriptor, e.j())) {
            return (T) androidx.savedstate.serialization.serializers.d.f75229a.deserialize(jVar);
        }
        if (Intrinsics.areEqual(descriptor, e.p())) {
            return (T) androidx.savedstate.serialization.serializers.f.f75232b.deserialize(jVar);
        }
        if (Intrinsics.areEqual(descriptor, e.m())) {
            return (T) androidx.savedstate.serialization.serializers.e.f75231b.deserialize(jVar);
        }
        if (Intrinsics.areEqual(descriptor, e.l())) {
            return (T) androidx.savedstate.serialization.serializers.g.f75233a.deserialize(jVar);
        }
        if (!Intrinsics.areEqual(descriptor, e.a()) && !Intrinsics.areEqual(descriptor, e.h())) {
            if (Intrinsics.areEqual(descriptor, e.c()) || Intrinsics.areEqual(descriptor, e.k())) {
                return (T) androidx.savedstate.serialization.serializers.c.f75227a.deserialize(jVar);
            }
            if (Intrinsics.areEqual(descriptor, e.e())) {
                Parcelable[] parcelableArrB = androidx.savedstate.serialization.serializers.k.f75238a.deserialize(jVar);
                return (T) Arrays.copyOf(parcelableArrB, parcelableArrB.length, oj.b.e(b(strategy)));
            }
            if (Intrinsics.areEqual(descriptor, e.n())) {
                return (T) androidx.savedstate.serialization.serializers.k.f75238a.deserialize(jVar);
            }
            if (Intrinsics.areEqual(descriptor, e.g()) || Intrinsics.areEqual(descriptor, e.q())) {
                return (T) androidx.savedstate.serialization.serializers.l.f75240a.deserialize(jVar);
            }
            if (Intrinsics.areEqual(descriptor, e.s()) || Intrinsics.areEqual(descriptor, e.r()) || Intrinsics.areEqual(descriptor, e.d())) {
                return (T) androidx.savedstate.serialization.serializers.r.f75249a.deserialize(jVar);
            }
            return null;
        }
        return (T) androidx.savedstate.serialization.serializers.b.f75225a.deserialize(jVar);
    }

    private static final kotlin.reflect.d<Object[]> b(kotlinx.serialization.e<?> eVar) {
        Object objDeserialize = eVar.deserialize(c.f75167d);
        Intrinsics.checkNotNull(objDeserialize);
        return j1.d(objDeserialize.getClass());
    }
}
