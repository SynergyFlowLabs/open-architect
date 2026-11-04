package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.k3;
import androidx.compose.runtime.n7;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$2$1", f = "SoundWaveVisualization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class SoundWaveVisualizationKt$SoundWaveVisualization$2$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ n7<Float> $amplitude$delegate;
    final /* synthetic */ DrawingConstants $drawingConstants;
    final /* synthetic */ k3 $lastRawAmplitude$delegate;
    final /* synthetic */ k3 $smoothedAmplitude$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundWaveVisualizationKt$SoundWaveVisualization$2$1(DrawingConstants drawingConstants, n7<Float> n7Var, k3 k3Var, k3 k3Var2, kotlin.coroutines.d<? super SoundWaveVisualizationKt$SoundWaveVisualization$2$1> dVar) {
        super(2, dVar);
        this.$drawingConstants = drawingConstants;
        this.$amplitude$delegate = n7Var;
        this.$lastRawAmplitude$delegate = k3Var;
        this.$smoothedAmplitude$delegate = k3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$2$1(this.$drawingConstants, this.$amplitude$delegate, this.$lastRawAmplitude$delegate, this.$smoothedAmplitude$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        float fSoundWaveVisualization_FNF3uiM$lambda$0 = SoundWaveVisualizationKt.SoundWaveVisualization_FNF3uiM$lambda$0(this.$amplitude$delegate);
        if (Math.abs(fSoundWaveVisualization_FNF3uiM$lambda$0 - this.$lastRawAmplitude$delegate.V0()) >= this.$drawingConstants.getAmplitudeDeadZone()) {
            this.$smoothedAmplitude$delegate.q((this.$drawingConstants.getAmplitudeSmoothingFactor() * fSoundWaveVisualization_FNF3uiM$lambda$0) + ((1.0f - this.$drawingConstants.getAmplitudeSmoothingFactor()) * this.$smoothedAmplitude$delegate.V0()));
            this.$lastRawAmplitude$delegate.q(fSoundWaveVisualization_FNF3uiM$lambda$0);
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$2$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
