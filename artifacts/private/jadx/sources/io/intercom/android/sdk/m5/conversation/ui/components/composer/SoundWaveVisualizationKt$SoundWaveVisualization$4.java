package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.k3;
import androidx.compose.runtime.m3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$4", f = "SoundWaveVisualization.kt", i = {}, l = {385}, m = "invokeSuspend", n = {}, s = {})
final class SoundWaveVisualizationKt$SoundWaveVisualization$4 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ m3 $animationFrameCounter$delegate;
    final /* synthetic */ long $animationFrameRateMs;
    final /* synthetic */ float $animationSpeedPxPerMs;
    final /* synthetic */ k3 $canvasWidth$delegate;
    final /* synthetic */ float $elementSpacingPx;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundWaveVisualizationKt$SoundWaveVisualization$4(float f10, float f11, WaveformBuffer waveformBuffer, long j10, k3 k3Var, m3 m3Var, kotlin.coroutines.d<? super SoundWaveVisualizationKt$SoundWaveVisualization$4> dVar) {
        super(2, dVar);
        this.$elementSpacingPx = f10;
        this.$animationSpeedPxPerMs = f11;
        this.$waveformBuffer = waveformBuffer;
        this.$animationFrameRateMs = j10;
        this.$canvasWidth$delegate = k3Var;
        this.$animationFrameCounter$delegate = m3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$4(this.$elementSpacingPx, this.$animationSpeedPxPerMs, this.$waveformBuffer, this.$animationFrameRateMs, this.$canvasWidth$delegate, this.$animationFrameCounter$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        long j10;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i10 = this.label;
        if (i10 != 0 && i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        do {
            if (this.$canvasWidth$delegate.V0() > 0.0f) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.$waveformBuffer.cleanupOldElements(jCurrentTimeMillis, (long) ((this.$canvasWidth$delegate.V0() + this.$elementSpacingPx) / this.$animationSpeedPxPerMs));
                this.$animationFrameCounter$delegate.C(jCurrentTimeMillis);
            }
            j10 = this.$animationFrameRateMs;
            this.label = 1;
        } while (kotlinx.coroutines.d1.b(j10, this) != objL);
        return objL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$4) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
