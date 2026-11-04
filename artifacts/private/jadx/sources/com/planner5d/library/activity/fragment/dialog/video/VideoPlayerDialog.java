package com.planner5d.library.activity.fragment.dialog.video;

import android.R;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.compose.runtime.internal.w0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;
import androidx.lifecycle.d1;
import androidx.lifecycle.i2;
import androidx.lifecycle.l2;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.UriMediaItem;
import androidx.media2.player.MediaPlayer;
import androidx.media2.widget.VideoView;
import com.google.common.util.concurrent.a2;
import com.planner5d.library.activity.fragment.dialog.Dialog;
import com.planner5d.library.activity.fragment.dialog.n0;
import com.planner5d.library.databinding.v;
import com.planner5d.library.services.r;
import com.planner5d.library.services.utility.j;
import com.planner5d.library.services.utility.t3;
import kotlin.Unit;
import kotlin.f0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.j1;
import kotlin.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nVideoPlayerDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoPlayerDialog.kt\ncom/planner5d/library/activity/fragment/dialog/video/VideoPlayerDialog\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils\n+ 3 BundleParser.kt\ncom/planner5d/library/services/utility/BundleParser\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,126:1\n19#2,10:127\n58#3,17:137\n1#4:154\n257#5,2:155\n299#5,2:157\n257#5,2:159\n299#5,2:161\n*S KotlinDebug\n*F\n+ 1 VideoPlayerDialog.kt\ncom/planner5d/library/activity/fragment/dialog/video/VideoPlayerDialog\n*L\n34#1:127,10\n44#1:137,17\n74#1:155,2\n75#1:157,2\n95#1:159,2\n96#1:161,2\n*E\n"})
public final class VideoPlayerDialog extends Dialog<Void> implements n0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @Nullable
    private MediaPlayer f133085l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private int f133086m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private v f133087n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    @NotNull
    private final f0 f133088o3;

    static final class a implements d1, c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f133089a;

        a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f133089a = function;
        }

        @Override // kotlin.jvm.internal.c0
        @NotNull
        public final x<?> b() {
            return this.f133089a;
        }

        @Override // androidx.lifecycle.d1
        public final /* synthetic */ void c(Object obj) {
            this.f133089a.invoke(obj);
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof d1) && (obj instanceof c0)) {
                return Intrinsics.areEqual(b(), ((c0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @SourceDebugExtension({"SMAP\nViewModelUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$viewModelProvider$3\n+ 2 ViewModelUtils.kt\ncom/planner5d/library/services/utility/ViewModelUtils$savedStateViewModelProvider$1\n*L\n1#1,28:1\n20#2:29\n*E\n"})
    public static final class b implements Function0<l2> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f133090a;

        public b(Fragment fragment) {
            this.f133090a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l2 invoke() {
            return this.f133090a.getViewModelStore();
        }
    }

    public VideoPlayerDialog() {
        t3 t3Var = t3.f229751a;
        this.f133088o3 = new i2(j1.d(f.class), new b(this), new t3.b(this), null, 8, null);
    }

    private final void H(MediaPlayer mediaPlayer) {
        if (!isVisible()) {
            O();
        } else if (I().Z()) {
            mediaPlayer.B();
        }
    }

    private final f I() {
        return (f) this.f133088o3.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(VideoPlayerDialog videoPlayerDialog, String str, Uri uri) {
        if (uri != null) {
            videoPlayerDialog.K(uri, str);
        }
        return Unit.f312394a;
    }

    private final void K(Uri uri, String str) {
        final MediaPlayer mediaPlayer = new MediaPlayer(requireContext());
        this.f133085l3 = mediaPlayer;
        MediaMetadata mediaMetadataA = new MediaMetadata.b().f("android.media.metadata.TITLE", str).a();
        Intrinsics.checkNotNullExpressionValue(mediaMetadataA, "build(...)");
        UriMediaItem uriMediaItemA = new UriMediaItem.a(uri).c(mediaMetadataA).a();
        Intrinsics.checkNotNullExpressionValue(uriMediaItemA, "build(...)");
        mediaPlayer.f(new AudioAttributesCompat.d().b(3).e(1).a());
        v vVar = this.f133087n3;
        if (vVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar = null;
        }
        vVar.f159790c.setPlayer(mediaPlayer);
        mediaPlayer.g(uriMediaItemA);
        mediaPlayer.A().m0(new Runnable() { // from class: com.planner5d.library.activity.fragment.dialog.video.d
            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayerDialog.L(this.f133095a, mediaPlayer);
            }
        }, a2.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(final VideoPlayerDialog videoPlayerDialog, final MediaPlayer mediaPlayer) {
        s activity = videoPlayerDialog.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: com.planner5d.library.activity.fragment.dialog.video.b
                @Override // java.lang.Runnable
                public final void run() {
                    VideoPlayerDialog.M(this.f133091a, mediaPlayer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(final VideoPlayerDialog videoPlayerDialog, final MediaPlayer mediaPlayer) {
        v vVar = videoPlayerDialog.f133087n3;
        v vVar2 = null;
        if (vVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar = null;
        }
        VideoView videoView = vVar.f159790c;
        Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
        videoView.setVisibility(0);
        v vVar3 = videoPlayerDialog.f133087n3;
        if (vVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vVar2 = vVar3;
        }
        ProgressBar networkProgress = vVar2.f159789b;
        Intrinsics.checkNotNullExpressionValue(networkProgress, "networkProgress");
        networkProgress.setVisibility(8);
        long jV = videoPlayerDialog.I().V();
        if (jV > 0) {
            mediaPlayer.F(jV).m0(new Runnable() { // from class: com.planner5d.library.activity.fragment.dialog.video.e
                @Override // java.lang.Runnable
                public final void run() {
                    VideoPlayerDialog.N(this.f133097a, mediaPlayer);
                }
            }, a2.c());
        } else {
            videoPlayerDialog.H(mediaPlayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(VideoPlayerDialog videoPlayerDialog, MediaPlayer mediaPlayer) {
        videoPlayerDialog.H(mediaPlayer);
    }

    private final void O() {
        MediaPlayer mediaPlayer = this.f133085l3;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            mediaPlayer.close();
        }
    }

    @Override // com.planner5d.library.activity.fragment.dialog.Dialog, androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme.Black.NoTitleBar.Fullscreen);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        s activity = getActivity();
        if (activity != null) {
            activity.setRequestedOrientation(this.f133086m3);
        }
        f fVarI = I();
        MediaPlayer mediaPlayer = this.f133085l3;
        long jLongValue = 0;
        v vVar = null;
        if (mediaPlayer != null) {
            Long lValueOf = Long.valueOf(mediaPlayer.getCurrentPosition());
            if (lValueOf.longValue() <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            }
        }
        MediaPlayer mediaPlayer2 = this.f133085l3;
        fVarI.Y(jLongValue, mediaPlayer2 != null && mediaPlayer2.s0() == 2);
        O();
        v vVar2 = this.f133087n3;
        if (vVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            vVar2 = null;
        }
        VideoView videoView = vVar2.f159790c;
        Intrinsics.checkNotNullExpressionValue(videoView, "videoView");
        videoView.setVisibility(8);
        v vVar3 = this.f133087n3;
        if (vVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            vVar = vVar3;
        }
        ProgressBar networkProgress = vVar.f159789b;
        Intrinsics.checkNotNullExpressionValue(networkProgress, "networkProgress");
        networkProgress.setVisibility(0);
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        final String strT = new j(getArguments()).t(r.title, null);
        if (strT == null) {
            strT = "";
        }
        I().W().k(getViewLifecycleOwner(), new a(new Function1() { // from class: com.planner5d.library.activity.fragment.dialog.video.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoPlayerDialog.J(this.f133093a, strT, (Uri) obj);
            }
        }));
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        android.app.Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.setNavigationBarColor(androidx.core.content.d.g(requireActivity(), com.planner5d.library.f.C1549f.f166521m1));
        }
        s activity = getActivity();
        if (activity != null) {
            this.f133086m3 = activity.getRequestedOrientation();
            activity.setRequestedOrientation(4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public ConstraintLayout onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Parcelable parcelable;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        v vVarD = v.d(inflater, viewGroup, false);
        this.f133087n3 = vVarD;
        j jVar = new j(getArguments());
        r rVar = r.uri;
        try {
            parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) jVar.g().getParcelable(rVar.f224891a, Uri.class) : jVar.g().getParcelable(rVar.f224891a);
            if (parcelable == null || !(parcelable instanceof Uri)) {
                parcelable = null;
            }
        } catch (ClassCastException unused) {
        }
        Uri uri = (Uri) (parcelable != null ? parcelable : null);
        if (uri != null) {
            I().X(uri);
        }
        ConstraintLayout root = vVarD.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }
}
