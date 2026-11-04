package t3;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.m0;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static final /* synthetic */ <K, V> e<K, V> a() {
        Intrinsics.reifiedOperationMarker(6, "K");
        q0.n("kotlinx.serialization.serializer.simple");
        KSerializer<Object> kSerializerK = m0.k(null);
        Intrinsics.reifiedOperationMarker(6, androidx.exifinterface.media.a.Y4);
        q0.n("kotlinx.serialization.serializer.simple");
        return new e<>(kSerializerK, m0.k(null));
    }
}
