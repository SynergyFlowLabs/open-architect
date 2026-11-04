package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.k3;
import androidx.compose.runtime.m3;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.f(c = "io.intercom.android.sdk.m5.conversation.ui.components.composer.SoundWaveVisualizationKt$SoundWaveVisualization$3", f = "SoundWaveVisualization.kt", i = {}, l = {367}, m = "invokeSuspend", n = {}, s = {})
final class SoundWaveVisualizationKt$SoundWaveVisualization$3 extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {
    final /* synthetic */ k3 $canvasWidth$delegate;
    final /* synthetic */ long $elementGenerationIntervalMs;
    final /* synthetic */ m3 $lastElementGenerationTime$delegate;
    final /* synthetic */ k3 $smoothedAmplitude$delegate;
    final /* synthetic */ WaveformBuffer $waveformBuffer;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SoundWaveVisualizationKt$SoundWaveVisualization$3(long j10, WaveformBuffer waveformBuffer, k3 k3Var, m3 m3Var, k3 k3Var2, kotlin.coroutines.d<? super SoundWaveVisualizationKt$SoundWaveVisualization$3> dVar) {
        super(2, dVar);
        this.$elementGenerationIntervalMs = j10;
        this.$waveformBuffer = waveformBuffer;
        this.$canvasWidth$delegate = k3Var;
        this.$lastElementGenerationTime$delegate = m3Var;
        this.$smoothedAmplitude$delegate = k3Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new SoundWaveVisualizationKt$SoundWaveVisualization$3(this.$elementGenerationIntervalMs, this.$waveformBuffer, this.$canvasWidth$delegate, this.$lastElementGenerationTime$delegate, this.$smoothedAmplitude$delegate, dVar);
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.$canvasWidth$delegate.V0() > 0.0f && (this.$lastElementGenerationTime$delegate.e() == 0 || jCurrentTimeMillis - this.$lastElementGenerationTime$delegate.e() >= this.$elementGenerationIntervalMs)) {
                this.$waveformBuffer.addElement(new WaveformElement(0.0f, SoundWaveVisualizationKt.scaleAmplitudeForVisualization(this.$smoothedAmplitude$delegate.V0()), jCurrentTimeMillis));
                this.$lastElementGenerationTime$delegate.C(jCurrentTimeMillis);
            }
            j10 = this.$elementGenerationIntervalMs;
            this.label = 1;
        } while (kotlinx.coroutines.d1.b(j10, this) != objL);
        return objL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
        return ((SoundWaveVisualizationKt$SoundWaveVisualization$3) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
    }
}
