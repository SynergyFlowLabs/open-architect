package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nSoundWaveVisualization.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundWaveVisualization.kt\nio/intercom/android/sdk/m5/conversation/ui/components/composer/WaveformBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,549:1\n1#2:550\n*E\n"})
final class WaveformBuffer {
    private int capacity;

    @NotNull
    private WaveformElement[] elements;
    private int head;
    private int size;

    public WaveformBuffer() {
        this(0, 1, null);
    }

    public final void addElement(@NotNull WaveformElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        WaveformElement[] waveformElementArr = this.elements;
        int i10 = this.head;
        waveformElementArr[i10] = element;
        int i11 = this.capacity;
        this.head = (i10 + 1) % i11;
        int i12 = this.size;
        if (i12 < i11) {
            this.size = i12 + 1;
        }
    }

    public final void cleanupOldElements(long j10, long j11) {
        int i10 = this.head;
        int i11 = this.size;
        int i12 = this.capacity;
        int i13 = ((i10 - i11) + i12) % i12;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (this.head - this.size) + i15;
            int i17 = this.capacity;
            int i18 = (i16 + i17) % i17;
            WaveformElement waveformElement = this.elements[i18];
            if (waveformElement == null || j10 - waveformElement.getTimestamp() > j11) {
                this.elements[i18] = null;
            } else {
                if (i18 != i13) {
                    WaveformElement[] waveformElementArr = this.elements;
                    waveformElementArr[i13] = waveformElement;
                    waveformElementArr[i18] = null;
                }
                i13 = (i13 + 1) % this.capacity;
                i14++;
            }
        }
        this.size = i14;
        this.head = i13;
    }

    @NotNull
    public final List<WaveformElement> getAllElements() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.size;
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (this.head - this.size) + i11;
            int i13 = this.capacity;
            WaveformElement waveformElement = this.elements[(i12 + i13) % i13];
            if (waveformElement != null) {
                arrayList.add(waveformElement);
            }
        }
        return arrayList;
    }

    public final int getCurrentSize() {
        return this.size;
    }

    public final void resizeBuffer(int i10) {
        int i11 = this.capacity;
        if (i10 == i11) {
            return;
        }
        WaveformElement[] waveformElementArr = this.elements;
        int i12 = this.head;
        int i13 = this.size;
        this.capacity = i10;
        WaveformElement[] waveformElementArr2 = new WaveformElement[i10];
        int i14 = 5 >> 0;
        for (int i15 = 0; i15 < i10; i15++) {
            waveformElementArr2[i15] = null;
        }
        this.elements = waveformElementArr2;
        this.head = 0;
        this.size = 0;
        int iMin = Math.min(i13, i10);
        for (int i16 = 0; i16 < iMin; i16++) {
            WaveformElement waveformElement = waveformElementArr[(((i12 - i13) + i16) + i11) % i11];
            if (waveformElement != null) {
                addElement(waveformElement);
            }
        }
    }

    public WaveformBuffer(int i10) {
        this.capacity = i10;
        WaveformElement[] waveformElementArr = new WaveformElement[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            waveformElementArr[i11] = null;
        }
        this.elements = waveformElementArr;
    }

    public /* synthetic */ WaveformBuffer(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 70 : i10);
    }
}
