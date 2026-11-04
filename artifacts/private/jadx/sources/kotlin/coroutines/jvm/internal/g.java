package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.e1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f312476a = 1;

    private static final void a(int i10, int i11) {
        if (i11 <= i10) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i10 + ", got " + i11 + ". Please update the Kotlin standard library.").toString());
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField(com.google.firebase.messaging.e.f.f123534d);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @e1(version = "1.3")
    @oj.i(name = "getSpilledVariableFieldMapping")
    @Nullable
    public static final String[] d(@NotNull a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        f fVarB = b(aVar);
        if (fVarB == null) {
            return null;
        }
        a(1, fVarB.v());
        ArrayList arrayList = new ArrayList();
        int iC = c(aVar);
        int[] iArrI = fVarB.i();
        int length = iArrI.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (iArrI[i10] == iC) {
                arrayList.add(fVarB.s()[i10]);
                arrayList.add(fVarB.n()[i10]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @e1(version = "1.3")
    @oj.i(name = "getStackTraceElement")
    @Nullable
    public static final StackTraceElement e(@NotNull a aVar) {
        String strC;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        f fVarB = b(aVar);
        if (fVarB == null) {
            return null;
        }
        a(1, fVarB.v());
        int iC = c(aVar);
        int i10 = iC < 0 ? -1 : fVarB.l()[iC];
        String strB = i.f312477a.b(aVar);
        if (strB == null) {
            strC = fVarB.c();
        } else {
            strC = strB + '/' + fVarB.c();
        }
        return new StackTraceElement(strC, fVarB.m(), fVarB.f(), i10);
    }
}
