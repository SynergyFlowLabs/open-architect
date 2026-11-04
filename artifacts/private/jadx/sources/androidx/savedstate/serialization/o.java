package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.d0;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean a(@NotNull m mVar, @NotNull d0<? super T> strategy, T t10) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        SerialDescriptor descriptor = strategy.getDescriptor();
        if (Intrinsics.areEqual(descriptor, e.j())) {
            androidx.savedstate.serialization.serializers.d dVar = androidx.savedstate.serialization.serializers.d.f75229a;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.CharSequence");
            dVar.serialize(mVar, (CharSequence) t10);
        } else if (Intrinsics.areEqual(descriptor, e.p())) {
            androidx.savedstate.serialization.serializers.f fVar = androidx.savedstate.serialization.serializers.f.f75232b;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type android.os.Parcelable");
            fVar.serialize(mVar, (Parcelable) t10);
        } else if (Intrinsics.areEqual(descriptor, e.m())) {
            androidx.savedstate.serialization.serializers.e eVar = androidx.savedstate.serialization.serializers.e.f75231b;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type java.io.Serializable");
            eVar.serialize(mVar, (Serializable) t10);
        } else if (Intrinsics.areEqual(descriptor, e.l())) {
            androidx.savedstate.serialization.serializers.g gVar = androidx.savedstate.serialization.serializers.g.f75233a;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type android.os.IBinder");
            gVar.serialize(mVar, (IBinder) t10);
        } else if (Intrinsics.areEqual(descriptor, e.a()) || Intrinsics.areEqual(descriptor, e.h())) {
            androidx.savedstate.serialization.serializers.b bVar = androidx.savedstate.serialization.serializers.b.f75225a;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
            bVar.serialize(mVar, (CharSequence[]) t10);
        } else if (Intrinsics.areEqual(descriptor, e.c()) || Intrinsics.areEqual(descriptor, e.k())) {
            androidx.savedstate.serialization.serializers.c cVar = androidx.savedstate.serialization.serializers.c.f75227a;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.collections.List<kotlin.CharSequence>");
            cVar.serialize(mVar, (List) t10);
        } else if (Intrinsics.areEqual(descriptor, e.e()) || Intrinsics.areEqual(descriptor, e.n())) {
            androidx.savedstate.serialization.serializers.k kVar = androidx.savedstate.serialization.serializers.k.f75238a;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
            kVar.serialize(mVar, (Parcelable[]) t10);
        } else if (Intrinsics.areEqual(descriptor, e.g()) || Intrinsics.areEqual(descriptor, e.q())) {
            androidx.savedstate.serialization.serializers.l lVar = androidx.savedstate.serialization.serializers.l.f75240a;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type kotlin.collections.List<android.os.Parcelable>");
            lVar.serialize(mVar, (List) t10);
        } else {
            if (!Intrinsics.areEqual(descriptor, e.s()) && !Intrinsics.areEqual(descriptor, e.r()) && !Intrinsics.areEqual(descriptor, e.d())) {
                return false;
            }
            androidx.savedstate.serialization.serializers.r rVar = androidx.savedstate.serialization.serializers.r.f75249a;
            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type android.util.SparseArray<android.os.Parcelable>");
            rVar.serialize(mVar, (SparseArray) t10);
        }
        return true;
    }
}
