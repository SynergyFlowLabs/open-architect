package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.k3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$1", f = "SoundWaveVisualization.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class SoundWaveVisualizationKt$SoundWaveVisualization$1 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ k3 $canvasWidth$delegate;
    final /* synthetic */ float $elementSpacingPx;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundWaveVisualizationKt$SoundWaveVisualization$1(float f10, WaveformBuffer waveformBuffer, k3 k3Var, kotlin.coroutines.d<? super SoundWaveVisualizationKt$SoundWaveVisualization$1> dVar) {
        super(2, dVar);
        this.$elementSpacingPx = f10;
        this.$waveformBuffer = waveformBuffer;
        this.$canvasWidth$delegate = k3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$1(this.$elementSpacingPx, this.$waveformBuffer, this.$canvasWidth$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        if (this.$canvasWidth$delegate.V0() > 0.0f) {
            this.$waveformBuffer.resizeBuffer(SoundWaveVisualizationKt.calculateOptimalBufferSize(this.$canvasWidth$delegate.V0(), this.$elementSpacingPx));
        }
        return Unit.f312394a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$1) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
