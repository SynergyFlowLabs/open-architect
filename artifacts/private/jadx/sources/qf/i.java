package qf;

import com.sdk.growthbook.serializable_model.SerializableGBExperimentResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class i {
    @NotNull
    public static final com.sdk.growthbook.model.g a(@NotNull SerializableGBExperimentResult serializableGBExperimentResult) {
        Intrinsics.checkNotNullParameter(serializableGBExperimentResult, "<this>");
        String strU = serializableGBExperimentResult.u();
        String strV = serializableGBExperimentResult.v();
        Float fO = serializableGBExperimentResult.o();
        Boolean boolR = serializableGBExperimentResult.r();
        String strS = serializableGBExperimentResult.s();
        String strP = serializableGBExperimentResult.p();
        int iZ = serializableGBExperimentResult.z();
        Boolean boolW = serializableGBExperimentResult.w();
        return new com.sdk.growthbook.model.g(serializableGBExperimentResult.t(), iZ, nf.a.a(com.sdk.growthbook.model.q.Companion, serializableGBExperimentResult.y()), serializableGBExperimentResult.q(), strS, strU, strV, fO, boolW, boolR, strP, serializableGBExperimentResult.x());
    }
}
