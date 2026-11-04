package androidx.datastore.preferences.core;

import androidx.datastore.preferences.protobuf.u;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import okio.m;
import okio.n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPreferencesSerializer.jvmAndroid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferencesSerializer.jvmAndroid.kt\nandroidx/datastore/preferences/core/PreferencesSerializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,114:1\n215#2,2:115\n*S KotlinDebug\n*F\n+ 1 PreferencesSerializer.jvmAndroid.kt\nandroidx/datastore/preferences/core/PreferencesSerializer\n*L\n50#1:115,2\n*E\n"})
public final class k implements androidx.datastore.core.okio.d<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f49880a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final String f49881b = "preferences_pb";

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49882a;

        static {
            int[] iArr = new int[androidx.datastore.preferences.f.C0442f.b.values().length];
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.datastore.preferences.f.C0442f.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f49882a = iArr;
        }
    }

    private k() {
    }

    private final void c(String str, androidx.datastore.preferences.f.C0442f c0442f, c cVar) throws androidx.datastore.core.g {
        androidx.datastore.preferences.f.C0442f.b bVarA1 = c0442f.A1();
        switch (bVarA1 == null ? -1 : a.f49882a[bVarA1.ordinal()]) {
            case -1:
                throw new androidx.datastore.core.g("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new k0();
            case 1:
                cVar.o(i.a(str), Boolean.valueOf(c0442f.Q()));
                return;
            case 2:
                cVar.o(i.d(str), Float.valueOf(c0442f.C1()));
                return;
            case 3:
                cVar.o(i.c(str), Double.valueOf(c0442f.J1()));
                return;
            case 4:
                cVar.o(i.e(str), Integer.valueOf(c0442f.G0()));
                return;
            case 5:
                cVar.o(i.f(str), Long.valueOf(c0442f.U0()));
                return;
            case 6:
                f.a<String> aVarG = i.g(str);
                String strN1 = c0442f.N1();
                Intrinsics.checkNotNullExpressionValue(strN1, "value.string");
                cVar.o(aVarG, strN1);
                return;
            case 7:
                f.a<Set<String>> aVarH = i.h(str);
                List<String> listC1 = c0442f.L0().c1();
                Intrinsics.checkNotNullExpressionValue(listC1, "value.stringSet.stringsList");
                cVar.o(aVarH, CollectionsKt.toSet(listC1));
                return;
            case 8:
                f.a<byte[]> aVarB = i.b(str);
                byte[] bArrS0 = c0442f.z().s0();
                Intrinsics.checkNotNullExpressionValue(bArrS0, "value.bytes.toByteArray()");
                cVar.o(aVarB, bArrS0);
                return;
            case 9:
                throw new androidx.datastore.core.g("Value not set.", null, 2, null);
        }
    }

    private final androidx.datastore.preferences.f.C0442f e(Object obj) {
        if (obj instanceof Boolean) {
            androidx.datastore.preferences.f.C0442f c0442fBuild = androidx.datastore.preferences.f.C0442f.G8().A5(((Boolean) obj).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(c0442fBuild, "newBuilder().setBoolean(value).build()");
            return c0442fBuild;
        }
        if (obj instanceof Float) {
            androidx.datastore.preferences.f.C0442f c0442fBuild2 = androidx.datastore.preferences.f.C0442f.G8().I5(((Number) obj).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(c0442fBuild2, "newBuilder().setFloat(value).build()");
            return c0442fBuild2;
        }
        if (obj instanceof Double) {
            androidx.datastore.preferences.f.C0442f c0442fBuild3 = androidx.datastore.preferences.f.C0442f.G8().D5(((Number) obj).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(c0442fBuild3, "newBuilder().setDouble(value).build()");
            return c0442fBuild3;
        }
        if (obj instanceof Integer) {
            androidx.datastore.preferences.f.C0442f c0442fBuild4 = androidx.datastore.preferences.f.C0442f.G8().J5(((Number) obj).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(c0442fBuild4, "newBuilder().setInteger(value).build()");
            return c0442fBuild4;
        }
        if (obj instanceof Long) {
            androidx.datastore.preferences.f.C0442f c0442fBuild5 = androidx.datastore.preferences.f.C0442f.G8().R5(((Number) obj).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(c0442fBuild5, "newBuilder().setLong(value).build()");
            return c0442fBuild5;
        }
        if (obj instanceof String) {
            androidx.datastore.preferences.f.C0442f c0442fBuild6 = androidx.datastore.preferences.f.C0442f.G8().Z5((String) obj).build();
            Intrinsics.checkNotNullExpressionValue(c0442fBuild6, "newBuilder().setString(value).build()");
            return c0442fBuild6;
        }
        if (obj instanceof Set) {
            androidx.datastore.preferences.f.C0442f.a aVarG8 = androidx.datastore.preferences.f.C0442f.G8();
            androidx.datastore.preferences.f.d.a aVarN8 = androidx.datastore.preferences.f.d.n8();
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            androidx.datastore.preferences.f.C0442f c0442fBuild7 = aVarG8.c6(aVarN8.L4((Set) obj)).build();
            Intrinsics.checkNotNullExpressionValue(c0442fBuild7, "newBuilder()\n           …                 .build()");
            return c0442fBuild7;
        }
        if (obj instanceof byte[]) {
            androidx.datastore.preferences.f.C0442f c0442fBuild8 = androidx.datastore.preferences.f.C0442f.G8().B5(u.A((byte[]) obj)).build();
            Intrinsics.checkNotNullExpressionValue(c0442fBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return c0442fBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + obj.getClass().getName());
    }

    @Override // androidx.datastore.core.okio.d
    @Nullable
    public Object b(@NotNull n nVar, @NotNull kotlin.coroutines.d<? super f> dVar) throws IOException {
        androidx.datastore.preferences.f.b bVarA = androidx.datastore.preferences.e.f49883a.a(nVar.rf());
        c cVarC = g.c(new f.b[0]);
        Map<String, androidx.datastore.preferences.f.C0442f> mapP2 = bVarA.p2();
        Intrinsics.checkNotNullExpressionValue(mapP2, "preferencesProto.preferencesMap");
        for (Map.Entry<String, androidx.datastore.preferences.f.C0442f> entry : mapP2.entrySet()) {
            String name = entry.getKey();
            androidx.datastore.preferences.f.C0442f value = entry.getValue();
            k kVar = f49880a;
            Intrinsics.checkNotNullExpressionValue(name, "name");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            kVar.c(name, value, cVarC);
        }
        return cVarC.e();
    }

    @Override // androidx.datastore.core.okio.d
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f K() {
        return g.b();
    }

    @Override // androidx.datastore.core.okio.d
    @Nullable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(@NotNull f fVar, @NotNull m mVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) throws IOException {
        Map<f.a<?>, Object> mapA = fVar.a();
        androidx.datastore.preferences.f.b.a aVarG8 = androidx.datastore.preferences.f.b.g8();
        for (Map.Entry<f.a<?>, Object> entry : mapA.entrySet()) {
            aVarG8.Q4(entry.getKey().a(), e(entry.getValue()));
        }
        aVarG8.build().writeTo(mVar.nf());
        return Unit.f312394a;
    }
}
