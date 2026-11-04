package androidx.media3.exoplayer;

import android.media.AudioManager;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f63780a;

    public /* synthetic */ f(h hVar) {
        this.f63780a = hVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f63780a.h(i10);
    }
}
