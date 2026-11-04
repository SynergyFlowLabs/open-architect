package io.intercom.android.sdk.m5.conversation.utils;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.SoundPool;
import androidx.annotation.u0;
import androidx.compose.runtime.internal.w0;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.m5.conversation.utils.SoundPlayer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@w0(parameters = 0)
public final class SoundPlayer {
    public static final int NOT_FOUND_ID = -1;
    private int messageReceivedId;
    private boolean messageReceivedLoaded;
    private int operatorReceivedId;
    private boolean operatorReceivedLoaded;
    private int replyFailedId;
    private boolean replyFailedLoaded;
    private int replySentId;
    private boolean replySentLoaded;

    @NotNull
    private final SoundPool soundPool;

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Twig TWIG = LumberMill.getLogger();

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SoundPlayer() {
        SoundPool soundPoolBuild = new SoundPool.Builder().setAudioAttributes(new AudioAttributes.Builder().setContentType(4).setUsage(5).build()).build();
        Intrinsics.checkNotNullExpressionValue(soundPoolBuild, "build(...)");
        this.soundPool = soundPoolBuild;
        this.messageReceivedId = -1;
        this.replyFailedId = -1;
        this.replySentId = -1;
        this.operatorReceivedId = -1;
    }

    private final int loadSound(Context context, @u0 int i10) {
        try {
            return this.soundPool.load(context, i10, 1);
        } catch (Resources.NotFoundException e10) {
            TWIG.e(e10, "Could not play sound", new Object[0]);
            int i11 = 6 & (-1);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadSounds$lambda$0(SoundPlayer this$0, SoundPool soundPool, int i10, int i11) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (i11 == 0) {
            if (i10 == this$0.messageReceivedId) {
                this$0.messageReceivedLoaded = true;
                return;
            }
            if (i10 == this$0.replyFailedId) {
                this$0.replyFailedLoaded = true;
            } else if (i10 == this$0.replySentId) {
                this$0.replySentLoaded = true;
            } else if (i10 == this$0.operatorReceivedId) {
                this$0.operatorReceivedLoaded = true;
            }
        }
    }

    private final void playIfLoaded(boolean z10, int i10) {
        if (!z10 || i10 == -1) {
            return;
        }
        this.soundPool.play(i10, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public final void loadSounds(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: yh.a
            @Override // android.media.SoundPool.OnLoadCompleteListener
            public final void onLoadComplete(SoundPool soundPool, int i10, int i11) {
                SoundPlayer.loadSounds$lambda$0(this.f399782a, soundPool, i10, i11);
            }
        });
        this.messageReceivedId = loadSound(context, R.raw.intercom_received);
        this.replyFailedId = loadSound(context, R.raw.intercom_failed);
        this.replySentId = loadSound(context, R.raw.intercom_sent);
        this.operatorReceivedId = loadSound(context, R.raw.intercom_operator);
    }

    public final void playAdminMessageReceivedSound() {
        playIfLoaded(this.messageReceivedLoaded, this.messageReceivedId);
    }

    public final void playMessageFailedSound() {
        playIfLoaded(this.replyFailedLoaded, this.replyFailedId);
    }

    public final void playMessageSentSound() {
        playIfLoaded(this.replySentLoaded, this.replySentId);
    }

    public final void playOperatorMessageReceivedSound() {
        playIfLoaded(this.operatorReceivedLoaded, this.operatorReceivedId);
    }

    public final void release() {
        this.soundPool.release();
    }
}
