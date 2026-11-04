package androidx.media2.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.core.view.u1;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.UriMediaItem;
import androidx.media2.common.VideoSize;
import androidx.media2.session.MediaController;
import androidx.media2.session.SessionCommandGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class i extends androidx.media2.widget.k {
    private static final String A4 = "MediaControlView";
    static final boolean B4 = Log.isLoggable(A4, 3);
    private static final int C4 = 0;
    private static final int D4 = 1;
    private static final int E4 = 2;
    private static final int F4 = 3;
    private static final int G4 = 3;
    private static final int H4 = -1;
    private static final int I4 = 0;
    private static final int J4 = 1;
    private static final int K4 = 2;
    private static final int L4 = 0;
    private static final int M4 = 1;
    private static final int N4 = 2;
    private static final int O4 = 0;
    private static final int P4 = 1;
    private static final int Q4 = 2;
    private static final int R4 = 3;
    private static final long S4 = -1;
    private static final long T4 = 2000;
    private static final long U4 = 1000;
    private static final long V4 = 10000;
    private static final long W4 = 30000;
    private static final long X4 = 5000;
    private static final long Y4 = 250;
    private static final long Z4 = 250;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    private static final int f59882a5 = 1000;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    private static final int f59883b5 = 10000;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    private static final int f59884c5 = -1;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    private static final int f59885d5 = -1;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    private static final String f59886e5 = "";
    private View A3;
    private ViewGroup B3;
    private TextView C3;
    TextView D3;
    private TextView E3;
    private StringBuilder F3;
    private Formatter G3;
    boolean H1;
    ViewGroup H3;
    ViewGroup I3;
    ImageButton J3;
    ImageButton K3;
    private TextView L3;
    private ListView M3;
    private PopupWindow N3;
    h0 O3;
    i0 P3;
    private List<String> Q3;
    List<String> R3;
    private List<Integer> S3;
    List<String> T3;
    int U3;
    List<SessionPlayer.TrackInfo> V3;
    List<SessionPlayer.TrackInfo> W3;
    List<String> X3;
    List<String> Y3;
    List<Integer> Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    int f59887a4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f59888b;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    AnimatorSet f59889b4;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Resources f59890c;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    AnimatorSet f59891c4;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    androidx.media2.widget.m f59892d;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    AnimatorSet f59893d4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    f0 f59894e;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    AnimatorSet f59895e4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AccessibilityManager f59896f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    AnimatorSet f59897f4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f59898g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    boolean f59899g3;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    ValueAnimator f59900g4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f59901h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    boolean f59902h3;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    ValueAnimator f59903h4;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f59904i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    boolean f59905i3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    final Runnable f59906i4;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f59907j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    boolean f59908j3;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    final Runnable f59909j4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f59910k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    boolean f59911k3;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private final Runnable f59912k4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f59913l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    boolean f59914l3;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    Runnable f59915l4;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f59916m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private SparseArray<View> f59917m3;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    final Runnable f59918m4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f59919n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private View f59920n3;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    private final SeekBar.OnSeekBarChangeListener f59921n4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f59922o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private TextView f59923o3;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    private final View.OnClickListener f59924o4;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    long f59925p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    boolean f59926p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    boolean f59927p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private View f59928p3;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    private final View.OnClickListener f59929p4;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    ViewGroup f59930q3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    private final View.OnClickListener f59931q4;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private View f59932r3;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    private final View.OnClickListener f59933r4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f59934s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private View f59935s3;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    private final View.OnClickListener f59936s4;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    long f59937t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private View f59938t3;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    private final View.OnClickListener f59939t4;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    ViewGroup f59940u3;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    private final View.OnClickListener f59941u4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    long f59942v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    ImageButton f59943v3;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    private final View.OnClickListener f59944v4;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    long f59945w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private ViewGroup f59946w3;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    private final View.OnClickListener f59947w4;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    SeekBar f59948x3;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    private final View.OnClickListener f59949x4;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private View f59950y3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f59951y4;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private ViewGroup f59952z3;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    private PopupWindow.OnDismissListener f59953z4;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class a0 extends AnimatorListenerAdapter {
        a0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            iVar.f59934s = 1;
            if (iVar.f59911k3) {
                iVar.post(iVar.f59909j4);
                i.this.f59911k3 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.f59934s = 3;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.H3.setVisibility(4);
            ImageButton imageButtonH = i.this.h(androidx.media2.widget.n.f.f60094p);
            androidx.media2.widget.m mVar = i.this.f59892d;
            imageButtonH.setVisibility((mVar == null || !mVar.d()) ? 8 : 4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.I3.setVisibility(0);
        }
    }

    class b0 extends AnimatorListenerAdapter {
        b0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            iVar.f59934s = 2;
            if (iVar.f59911k3) {
                iVar.post(iVar.f59909j4);
                int i10 = 5 ^ 0;
                i.this.f59911k3 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.f59934s = 3;
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            i.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c0 extends AnimatorListenerAdapter {
        c0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            iVar.f59934s = 2;
            if (iVar.f59911k3) {
                iVar.post(iVar.f59909j4);
                i.this.f59911k3 = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.f59934s = 3;
        }
    }

    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.I3.setVisibility(8);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i10 = 0;
            i.this.H3.setVisibility(0);
            ImageButton imageButtonH = i.this.h(androidx.media2.widget.n.f.f60094p);
            androidx.media2.widget.m mVar = i.this.f59892d;
            if (mVar == null || !mVar.d()) {
                i10 = 8;
            }
            imageButtonH.setVisibility(i10);
        }
    }

    class d0 extends AnimatorListenerAdapter {
        d0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f59934s = 0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.f59934s = 3;
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.media2.widget.m mVar;
            boolean z10 = i.this.getVisibility() == 0;
            i iVar = i.this;
            if (iVar.f59926p1 || !z10 || (mVar = iVar.f59892d) == null || !mVar.A()) {
                return;
            }
            long jW = i.this.w();
            i iVar2 = i.this;
            iVar2.r(iVar2.f59906i4, 1000 - (jW % 1000));
        }
    }

    class e0 extends AnimatorListenerAdapter {
        e0() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f59934s = 0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.f59934s = 3;
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i iVar = i.this;
            int i10 = iVar.f59934s;
            if (i10 == 1) {
                iVar.f59895e4.start();
            } else if (i10 == 2) {
                iVar.f59897f4.start();
            } else if (i10 == 3) {
                iVar.f59911k3 = true;
            }
            if (i.this.f59892d.A()) {
                i iVar2 = i.this;
                iVar2.r(iVar2.f59915l4, iVar2.f59942v);
            }
        }
    }

    public interface f0 {
        void a(@NonNull View view, boolean z10);
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (i.this.x()) {
                return;
            }
            i.this.f59893d4.start();
        }
    }

    class g0 extends androidx.media2.widget.m.b {

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }

        g0() {
        }

        @Override // androidx.media2.widget.m.b
        public void a(@NonNull androidx.media2.widget.m mVar, @NonNull SessionCommandGroup sessionCommandGroup) {
            i iVar = i.this;
            if (mVar != iVar.f59892d) {
                return;
            }
            iVar.B();
        }

        @Override // androidx.media2.widget.m.b
        public void c(@NonNull androidx.media2.widget.m mVar, @p0 MediaItem mediaItem) {
            if (mVar != i.this.f59892d) {
                return;
            }
            if (i.B4) {
                Objects.toString(mediaItem);
            }
            i.this.J(mediaItem);
            i.this.K(mediaItem);
            i.this.F(mVar.u(), mVar.r());
        }

        @Override // androidx.media2.widget.m.b
        public void d(@NonNull androidx.media2.widget.m mVar) {
            i iVar = i.this;
            if (mVar != iVar.f59892d) {
                return;
            }
            boolean z10 = i.B4;
            iVar.G(true);
            i.this.f59948x3.setProgress(1000);
            i iVar2 = i.this;
            iVar2.D3.setText(iVar2.z(iVar2.f59937t));
        }

        @Override // androidx.media2.widget.m.b
        public void e(@NonNull androidx.media2.widget.m mVar, float f10) {
            if (mVar != i.this.f59892d) {
                return;
            }
            int iRound = Math.round(f10 * 100.0f);
            i iVar = i.this;
            if (iVar.f59887a4 != -1) {
                iVar.s();
            }
            int i10 = 0;
            if (i.this.Z3.contains(Integer.valueOf(iRound))) {
                while (i10 < i.this.Z3.size()) {
                    if (iRound == i.this.Z3.get(i10).intValue()) {
                        i iVar2 = i.this;
                        iVar2.H(i10, iVar2.Y3.get(i10));
                        return;
                    }
                    i10++;
                }
                return;
            }
            String string = i.this.f59890c.getString(androidx.media2.widget.n.h.f60121g, Float.valueOf(iRound / 100.0f));
            while (i10 < i.this.Z3.size()) {
                if (iRound < i.this.Z3.get(i10).intValue()) {
                    i.this.Z3.add(i10, Integer.valueOf(iRound));
                    i.this.Y3.add(i10, string);
                    i.this.H(i10, string);
                    break;
                } else {
                    if (i10 == i.this.Z3.size() - 1 && iRound > i.this.Z3.get(i10).intValue()) {
                        i.this.Z3.add(Integer.valueOf(iRound));
                        i.this.Y3.add(string);
                        i.this.H(i10 + 1, string);
                    }
                    i10++;
                }
            }
            i iVar3 = i.this;
            iVar3.f59887a4 = iVar3.f59919n;
        }

        @Override // androidx.media2.widget.m.b
        public void f(@NonNull androidx.media2.widget.m mVar, int i10) {
            if (mVar != i.this.f59892d) {
                return;
            }
            boolean z10 = i.B4;
            i.this.J(mVar.n());
            if (i10 == 1) {
                i.this.E(1);
                i iVar = i.this;
                iVar.removeCallbacks(iVar.f59906i4);
                i iVar2 = i.this;
                iVar2.removeCallbacks(iVar2.f59915l4);
                i iVar3 = i.this;
                iVar3.removeCallbacks(iVar3.f59918m4);
                i iVar4 = i.this;
                iVar4.post(iVar4.f59909j4);
                return;
            }
            if (i10 == 2) {
                i iVar5 = i.this;
                iVar5.removeCallbacks(iVar5.f59906i4);
                i iVar6 = i.this;
                iVar6.post(iVar6.f59906i4);
                i.this.u();
                i.this.G(false);
                return;
            }
            if (i10 != 3) {
                return;
            }
            i.this.E(1);
            i iVar7 = i.this;
            iVar7.removeCallbacks(iVar7.f59906i4);
            if (i.this.getWindowToken() != null) {
                new androidx.appcompat.app.c.a(i.this.getContext()).setMessage(androidx.media2.widget.n.h.D).setPositiveButton(androidx.media2.widget.n.h.f60132r, new a()).setCancelable(true).show();
            }
        }

        @Override // androidx.media2.widget.m.b
        void g(@NonNull androidx.media2.widget.m mVar, @p0 List<MediaItem> list, @p0 MediaMetadata mediaMetadata) {
            if (mVar != i.this.f59892d) {
                return;
            }
            if (i.B4) {
                Objects.toString(list);
                Objects.toString(mediaMetadata);
            }
            i.this.F(mVar.u(), mVar.r());
        }

        @Override // androidx.media2.widget.m.b
        public void h(@NonNull androidx.media2.widget.m mVar, long j10) {
            if (mVar != i.this.f59892d) {
                return;
            }
            boolean z10 = i.B4;
            i iVar = i.this;
            long j11 = iVar.f59937t;
            iVar.f59948x3.setProgress(j11 <= 0 ? 0 : (int) ((1000 * j10) / j11));
            i iVar2 = i.this;
            iVar2.D3.setText(iVar2.z(j10));
            i iVar3 = i.this;
            long j12 = iVar3.f59925p0;
            if (j12 != -1) {
                iVar3.f59945w = j12;
                mVar.E(j12);
                i.this.f59925p0 = -1L;
                return;
            }
            iVar3.f59945w = -1L;
            if (iVar3.f59926p1) {
                return;
            }
            iVar3.removeCallbacks(iVar3.f59906i4);
            i iVar4 = i.this;
            iVar4.removeCallbacks(iVar4.f59915l4);
            i iVar5 = i.this;
            iVar5.post(iVar5.f59906i4);
            i iVar6 = i.this;
            iVar6.r(iVar6.f59915l4, iVar6.f59942v);
        }

        @Override // androidx.media2.widget.m.b
        void j(@NonNull androidx.media2.widget.m mVar, @NonNull SessionPlayer.TrackInfo trackInfo) {
            if (mVar != i.this.f59892d) {
                return;
            }
            if (i.B4) {
                Objects.toString(trackInfo);
            }
            if (trackInfo.m() == 4) {
                int i10 = 6 ^ 0;
                for (int i11 = 0; i11 < i.this.W3.size(); i11++) {
                    if (i.this.W3.get(i11).equals(trackInfo)) {
                        i iVar = i.this;
                        iVar.f59913l = -1;
                        if (iVar.f59910k == 2) {
                            iVar.P3.b((-1) + 1);
                        }
                        i iVar2 = i.this;
                        iVar2.J3.setImageDrawable(androidx.core.content.d.l(iVar2.getContext(), androidx.media2.widget.n.e.f60076t));
                        i iVar3 = i.this;
                        iVar3.J3.setContentDescription(iVar3.f59890c.getString(androidx.media2.widget.n.h.f60130p));
                        return;
                    }
                }
            }
        }

        @Override // androidx.media2.widget.m.b
        void k(@NonNull androidx.media2.widget.m mVar, @NonNull SessionPlayer.TrackInfo trackInfo) {
            if (mVar != i.this.f59892d) {
                return;
            }
            if (i.B4) {
                Objects.toString(trackInfo);
            }
            if (trackInfo.m() != 4) {
                if (trackInfo.m() == 2) {
                    for (int i10 = 0; i10 < i.this.V3.size(); i10++) {
                        if (i.this.V3.get(i10).equals(trackInfo)) {
                            i iVar = i.this;
                            iVar.f59916m = i10;
                            iVar.R3.set(0, iVar.P3.a(i10));
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            for (int i11 = 0; i11 < i.this.W3.size(); i11++) {
                if (i.this.W3.get(i11).equals(trackInfo)) {
                    i iVar2 = i.this;
                    iVar2.f59913l = i11;
                    if (iVar2.f59910k == 2) {
                        iVar2.P3.b(i11 + 1);
                    }
                    i iVar3 = i.this;
                    iVar3.J3.setImageDrawable(androidx.core.content.d.l(iVar3.getContext(), androidx.media2.widget.n.e.f60077u));
                    i iVar4 = i.this;
                    iVar4.J3.setContentDescription(iVar4.f59890c.getString(androidx.media2.widget.n.h.f60131q));
                    return;
                }
            }
        }

        @Override // androidx.media2.widget.m.b
        void l(@NonNull androidx.media2.widget.m mVar, @NonNull List<SessionPlayer.TrackInfo> list) {
            if (mVar != i.this.f59892d) {
                return;
            }
            if (i.B4) {
                Objects.toString(list);
            }
            i.this.L(mVar, list);
            i.this.J(mVar.n());
            i.this.K(mVar.n());
        }

        @Override // androidx.media2.widget.m.b
        void m(@NonNull androidx.media2.widget.m mVar, @NonNull VideoSize videoSize) {
            List<SessionPlayer.TrackInfo> listX;
            if (mVar != i.this.f59892d) {
                return;
            }
            if (i.B4) {
                Objects.toString(videoSize);
            }
            if (i.this.U3 != 0 || videoSize.d() <= 0 || videoSize.f() <= 0 || (listX = mVar.x()) == null) {
                return;
            }
            i.this.L(mVar, listX);
        }
    }

    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!i.this.f59892d.A() || i.this.x()) {
                return;
            }
            i.this.f59889b4.start();
            i iVar = i.this;
            iVar.r(iVar.f59918m4, iVar.f59942v);
        }
    }

    private class h0 extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<Integer> f59969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<String> f59970b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private List<String> f59971c;

        h0(@p0 List<String> list, @p0 List<String> list2, List<Integer> list3) {
            this.f59970b = list;
            this.f59971c = list2;
            this.f59969a = list3;
        }

        public void a(List<String> list) {
            this.f59971c = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = this.f59970b;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View viewK = i.k(i.this.getContext(), androidx.media2.widget.n.g.f60113i);
            TextView textView = (TextView) viewK.findViewById(androidx.media2.widget.n.f.f60098t);
            TextView textView2 = (TextView) viewK.findViewById(androidx.media2.widget.n.f.G);
            ImageView imageView = (ImageView) viewK.findViewById(androidx.media2.widget.n.f.f60097s);
            textView.setText(this.f59970b.get(i10));
            List<String> list = this.f59971c;
            if (list == null || "".equals(list.get(i10))) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.f59971c.get(i10));
            }
            List<Integer> list2 = this.f59969a;
            if (list2 == null || list2.get(i10).intValue() == -1) {
                imageView.setVisibility(8);
                return viewK;
            }
            imageView.setImageDrawable(androidx.core.content.d.l(i.this.getContext(), this.f59969a.get(i10).intValue()));
            return viewK;
        }
    }

    /* JADX INFO: renamed from: androidx.media2.widget.i$i, reason: collision with other inner class name */
    class RunnableC0563i implements Runnable {
        RunnableC0563i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!i.this.f59892d.A() || i.this.x()) {
                return;
            }
            i.this.f59891c4.start();
        }
    }

    private class i0 extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<String> f59974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f59975b;

        i0(List<String> list, int i10) {
            this.f59974a = list;
            this.f59975b = i10;
        }

        public String a(int i10) {
            List<String> list = this.f59974a;
            return (list == null || i10 >= list.size()) ? "" : this.f59974a.get(i10);
        }

        public void b(int i10) {
            this.f59975b = i10;
        }

        public void c(List<String> list) {
            this.f59974a = list;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            List<String> list = this.f59974a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            View viewK = i.k(i.this.getContext(), androidx.media2.widget.n.g.f60114j);
            TextView textView = (TextView) viewK.findViewById(androidx.media2.widget.n.f.J);
            ImageView imageView = (ImageView) viewK.findViewById(androidx.media2.widget.n.f.f60091m);
            textView.setText(this.f59974a.get(i10));
            if (i10 != this.f59975b) {
                imageView.setVisibility(4);
            }
            return viewK;
        }
    }

    class j implements SeekBar.OnSeekBarChangeListener {
        j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            i iVar = i.this;
            if (iVar.f59892d != null && iVar.f59902h3 && z10 && iVar.f59926p1) {
                long j10 = iVar.f59937t;
                if (j10 > 0) {
                    i.this.v((j10 * ((long) i10)) / 1000, !iVar.p());
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            i iVar = i.this;
            if (iVar.f59892d == null || !iVar.f59902h3) {
                return;
            }
            iVar.f59926p1 = true;
            iVar.removeCallbacks(iVar.f59906i4);
            i iVar2 = i.this;
            iVar2.removeCallbacks(iVar2.f59915l4);
            i iVar3 = i.this;
            iVar3.removeCallbacks(iVar3.f59918m4);
            i iVar4 = i.this;
            if (iVar4.f59927p2) {
                iVar4.G(false);
            }
            if (i.this.p() && i.this.f59892d.A()) {
                i iVar5 = i.this;
                iVar5.f59914l3 = true;
                iVar5.f59892d.C();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            i iVar = i.this;
            if (iVar.f59892d == null || !iVar.f59902h3) {
                return;
            }
            iVar.f59926p1 = false;
            long latestSeekPosition = iVar.getLatestSeekPosition();
            if (i.this.p()) {
                i iVar2 = i.this;
                iVar2.f59945w = -1L;
                iVar2.f59925p0 = -1L;
            }
            i.this.v(latestSeekPosition, true);
            i iVar3 = i.this;
            if (iVar3.f59914l3) {
                iVar3.f59914l3 = false;
                iVar3.f59892d.D();
            }
        }
    }

    class k implements ValueAnimator.AnimatorUpdateListener {
        k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            i iVar = i.this;
            iVar.f59948x3.getThumb().setLevel((int) ((iVar.f59922o == 2 ? 0 : 10000) * fFloatValue));
            i.this.f59930q3.setAlpha(fFloatValue);
            i.this.f59940u3.setAlpha(fFloatValue);
        }
    }

    class l implements View.OnClickListener {
        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.u();
            i.this.A();
        }
    }

    class m implements View.OnClickListener {
        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.u();
            i iVar2 = i.this;
            iVar2.removeCallbacks(iVar2.f59906i4);
            i iVar3 = i.this;
            boolean z10 = iVar3.f59927p2 && iVar3.f59937t != 0;
            i.this.v(Math.max((z10 ? iVar3.f59937t : iVar3.getLatestSeekPosition()) - 10000, 0L), true);
            if (z10) {
                i.this.G(false);
            }
        }
    }

    class n implements View.OnClickListener {
        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.u();
            i iVar2 = i.this;
            iVar2.removeCallbacks(iVar2.f59906i4);
            long latestSeekPosition = i.this.getLatestSeekPosition();
            i iVar3 = i.this;
            long j10 = latestSeekPosition + 30000;
            iVar3.v(Math.min(j10, iVar3.f59937t), true);
            i iVar4 = i.this;
            if (j10 < iVar4.f59937t || iVar4.f59892d.A()) {
                return;
            }
            i.this.G(true);
        }
    }

    class o implements View.OnClickListener {
        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.u();
            i.this.f59892d.I();
        }
    }

    class p implements View.OnClickListener {
        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.u();
            i.this.f59892d.J();
        }
    }

    class q implements View.OnClickListener {
        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.removeCallbacks(iVar.f59915l4);
            i iVar2 = i.this;
            iVar2.removeCallbacks(iVar2.f59918m4);
            i iVar3 = i.this;
            iVar3.f59910k = 2;
            iVar3.P3.c(iVar3.T3);
            i iVar4 = i.this;
            iVar4.P3.b(iVar4.f59913l + 1);
            i iVar5 = i.this;
            iVar5.e(iVar5.P3);
        }
    }

    class r implements View.OnClickListener {
        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59894e == null) {
                return;
            }
            boolean z10 = iVar.H1;
            boolean z11 = !z10;
            if (z10) {
                iVar.K3.setImageDrawable(androidx.core.content.d.l(iVar.getContext(), androidx.media2.widget.n.e.f60065i));
                i iVar2 = i.this;
                iVar2.f59943v3.setImageDrawable(androidx.core.content.d.l(iVar2.getContext(), androidx.media2.widget.n.e.f60065i));
            } else {
                iVar.K3.setImageDrawable(androidx.core.content.d.l(iVar.getContext(), androidx.media2.widget.n.e.f60066j));
                i iVar3 = i.this;
                iVar3.f59943v3.setImageDrawable(androidx.core.content.d.l(iVar3.getContext(), androidx.media2.widget.n.e.f60066j));
            }
            i iVar4 = i.this;
            iVar4.H1 = z11;
            iVar4.f59894e.a(iVar4, z11);
        }
    }

    class s implements View.OnClickListener {
        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.u();
            i iVar2 = i.this;
            iVar2.f59899g3 = true;
            iVar2.f59900g4.start();
        }
    }

    class t implements View.OnClickListener {
        t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.u();
            i iVar2 = i.this;
            iVar2.f59899g3 = false;
            iVar2.f59903h4.start();
        }
    }

    class u implements View.OnClickListener {
        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            if (iVar.f59892d == null) {
                return;
            }
            iVar.removeCallbacks(iVar.f59915l4);
            i iVar2 = i.this;
            iVar2.removeCallbacks(iVar2.f59918m4);
            i iVar3 = i.this;
            iVar3.f59910k = 3;
            iVar3.O3.a(iVar3.R3);
            i iVar4 = i.this;
            iVar4.e(iVar4.O3);
        }
    }

    class v extends AnimatorListenerAdapter {
        v() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i.this.f59930q3.setVisibility(4);
            i.this.f59940u3.setVisibility(4);
        }
    }

    class w implements AdapterView.OnItemClickListener {
        w() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            i iVar = i.this;
            int i11 = iVar.f59910k;
            if (i11 == 0) {
                if (i10 != iVar.f59916m && iVar.V3.size() > 0) {
                    i iVar2 = i.this;
                    iVar2.f59892d.F(iVar2.V3.get(i10));
                }
                i.this.d();
                return;
            }
            if (i11 == 1) {
                if (i10 != iVar.f59919n) {
                    i.this.f59892d.G(iVar.Z3.get(i10).intValue() / 100.0f);
                }
                i.this.d();
                return;
            }
            if (i11 == 2) {
                int i12 = iVar.f59913l;
                if (i10 != i12 + 1) {
                    if (i10 > 0) {
                        iVar.f59892d.F(iVar.W3.get(i10 - 1));
                    } else {
                        iVar.f59892d.i(iVar.W3.get(i12));
                    }
                }
                i.this.d();
                return;
            }
            if (i11 != 3) {
                return;
            }
            if (i10 == 0) {
                iVar.P3.c(iVar.X3);
                i iVar3 = i.this;
                iVar3.P3.b(iVar3.f59916m);
                i.this.f59910k = 0;
            } else if (i10 == 1) {
                iVar.P3.c(iVar.Y3);
                i iVar4 = i.this;
                iVar4.P3.b(iVar4.f59919n);
                i.this.f59910k = 1;
            }
            i iVar5 = i.this;
            iVar5.e(iVar5.P3);
        }
    }

    class x implements PopupWindow.OnDismissListener {
        x() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            i iVar = i.this;
            if (iVar.f59908j3) {
                iVar.r(iVar.f59915l4, iVar.f59942v);
            }
        }
    }

    class y implements ValueAnimator.AnimatorUpdateListener {
        y() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            i iVar = i.this;
            iVar.f59948x3.getThumb().setLevel((int) ((iVar.f59922o == 2 ? 0 : 10000) * fFloatValue));
            i.this.f59930q3.setAlpha(fFloatValue);
            i.this.f59940u3.setAlpha(fFloatValue);
        }
    }

    class z extends AnimatorListenerAdapter {
        z() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            i.this.f59930q3.setVisibility(0);
            i.this.f59940u3.setVisibility(0);
        }
    }

    public i(@NonNull Context context) {
        this(context, null);
    }

    private void D(int i10) {
        if (i10 == 0 || i10 == 1) {
            this.f59948x3.getThumb().setLevel(10000);
        } else if (i10 == 2) {
            this.f59948x3.getThumb().setLevel(0);
        }
        G(this.f59927p2);
    }

    private boolean i() {
        if (this.U3 > 0) {
            return true;
        }
        VideoSize videoSizeY = this.f59892d.y();
        if (videoSizeY.d() <= 0 || videoSizeY.f() <= 0) {
            return false;
        }
        videoSizeY.toString();
        return true;
    }

    private void j() {
        if (x() || this.f59934s == 3) {
            return;
        }
        removeCallbacks(this.f59915l4);
        removeCallbacks(this.f59918m4);
        post(this.f59912k4);
    }

    static View k(Context context, int i10) {
        return ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(i10, (ViewGroup) null);
    }

    private void l() {
        this.f59920n3 = findViewById(androidx.media2.widget.n.f.Q);
        this.f59923o3 = (TextView) findViewById(androidx.media2.widget.n.f.T);
        this.f59928p3 = findViewById(androidx.media2.widget.n.f.f60079a);
        this.f59930q3 = (ViewGroup) findViewById(androidx.media2.widget.n.f.f60089k);
        this.f59932r3 = findViewById(androidx.media2.widget.n.f.f60090l);
        this.f59935s3 = m(androidx.media2.widget.n.f.f60092n);
        this.f59938t3 = m(androidx.media2.widget.n.f.f60101w);
        this.f59940u3 = (ViewGroup) findViewById(androidx.media2.widget.n.f.f60100v);
        ImageButton imageButton = (ImageButton) findViewById(androidx.media2.widget.n.f.f60099u);
        this.f59943v3 = imageButton;
        imageButton.setOnClickListener(this.f59941u4);
        this.f59946w3 = (ViewGroup) findViewById(androidx.media2.widget.n.f.D);
        SeekBar seekBar = (SeekBar) findViewById(androidx.media2.widget.n.f.C);
        this.f59948x3 = seekBar;
        seekBar.setOnSeekBarChangeListener(this.f59921n4);
        this.f59948x3.setMax(1000);
        this.f59945w = -1L;
        this.f59925p0 = -1L;
        this.f59950y3 = findViewById(androidx.media2.widget.n.f.f60087i);
        this.f59952z3 = (ViewGroup) findViewById(androidx.media2.widget.n.f.f60088j);
        this.A3 = m(androidx.media2.widget.n.f.f60095q);
        this.B3 = (ViewGroup) findViewById(androidx.media2.widget.n.f.L);
        this.C3 = (TextView) findViewById(androidx.media2.widget.n.f.N);
        this.D3 = (TextView) findViewById(androidx.media2.widget.n.f.M);
        this.E3 = (TextView) findViewById(androidx.media2.widget.n.f.f60082d);
        this.F3 = new StringBuilder();
        this.G3 = new Formatter(this.F3, Locale.getDefault());
        this.H3 = (ViewGroup) findViewById(androidx.media2.widget.n.f.f60086h);
        this.I3 = (ViewGroup) findViewById(androidx.media2.widget.n.f.f60093o);
        ImageButton imageButton2 = (ImageButton) findViewById(androidx.media2.widget.n.f.H);
        this.J3 = imageButton2;
        imageButton2.setOnClickListener(this.f59939t4);
        ImageButton imageButton3 = (ImageButton) findViewById(androidx.media2.widget.n.f.f60096r);
        this.K3 = imageButton3;
        imageButton3.setOnClickListener(this.f59941u4);
        ((ImageButton) findViewById(androidx.media2.widget.n.f.f60104z)).setOnClickListener(this.f59944v4);
        ((ImageButton) findViewById(androidx.media2.widget.n.f.f60103y)).setOnClickListener(this.f59947w4);
        ((ImageButton) findViewById(androidx.media2.widget.n.f.F)).setOnClickListener(this.f59949x4);
        this.L3 = (TextView) findViewById(androidx.media2.widget.n.f.f60081c);
        n();
        this.M3 = (ListView) k(getContext(), androidx.media2.widget.n.g.f60112h);
        this.O3 = new h0(this.Q3, this.R3, this.S3);
        this.P3 = new i0(null, 0);
        this.M3.setAdapter((ListAdapter) this.O3);
        this.M3.setChoiceMode(1);
        this.M3.setOnItemClickListener(this.f59951y4);
        this.f59917m3.append(0, this.f59935s3);
        this.f59917m3.append(1, this.A3);
        this.f59917m3.append(2, this.f59938t3);
        this.f59898g = this.f59890c.getDimensionPixelSize(androidx.media2.widget.n.d.f60036f);
        this.f59901h = this.f59890c.getDimensionPixelSize(androidx.media2.widget.n.d.f60038h);
        this.f59904i = this.f59890c.getDimensionPixelSize(androidx.media2.widget.n.d.f60048r);
        this.f59907j = this.f59890c.getDimensionPixelSize(androidx.media2.widget.n.d.f60051u);
        PopupWindow popupWindow = new PopupWindow((View) this.M3, this.f59898g, -2, true);
        this.N3 = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        this.N3.setOnDismissListener(this.f59953z4);
        float dimension = this.f59890c.getDimension(androidx.media2.widget.n.d.B);
        float dimension2 = this.f59890c.getDimension(androidx.media2.widget.n.d.f60034d);
        float dimension3 = this.f59890c.getDimension(androidx.media2.widget.n.d.f60031a);
        int i10 = 5 >> 3;
        View[] viewArr = {this.f59950y3, this.f59952z3, this.B3, this.H3, this.I3, this.f59946w3};
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new k());
        valueAnimatorOfFloat.addListener(new v());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new y());
        valueAnimatorOfFloat2.addListener(new z());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f59889b4 = animatorSet;
        float f10 = -dimension;
        animatorSet.play(valueAnimatorOfFloat).with(androidx.media2.widget.a.a(0.0f, f10, this.f59920n3)).with(androidx.media2.widget.a.b(0.0f, dimension3, viewArr));
        this.f59889b4.setDuration(250L);
        this.f59889b4.addListener(new a0());
        float f11 = dimension2 + dimension3;
        AnimatorSet animatorSetB = androidx.media2.widget.a.b(dimension3, f11, viewArr);
        this.f59891c4 = animatorSetB;
        animatorSetB.setDuration(250L);
        this.f59891c4.addListener(new b0());
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f59893d4 = animatorSet2;
        animatorSet2.play(valueAnimatorOfFloat).with(androidx.media2.widget.a.a(0.0f, f10, this.f59920n3)).with(androidx.media2.widget.a.b(0.0f, f11, viewArr));
        this.f59893d4.setDuration(250L);
        this.f59893d4.addListener(new c0());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f59895e4 = animatorSet3;
        animatorSet3.play(valueAnimatorOfFloat2).with(androidx.media2.widget.a.a(f10, 0.0f, this.f59920n3)).with(androidx.media2.widget.a.b(dimension3, 0.0f, viewArr));
        this.f59895e4.setDuration(250L);
        this.f59895e4.addListener(new d0());
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f59897f4 = animatorSet4;
        animatorSet4.play(valueAnimatorOfFloat2).with(androidx.media2.widget.a.a(f10, 0.0f, this.f59920n3)).with(androidx.media2.widget.a.b(f11, 0.0f, viewArr));
        this.f59897f4.setDuration(250L);
        this.f59897f4.addListener(new e0());
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f59900g4 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        this.f59900g4.addUpdateListener(new a());
        this.f59900g4.addListener(new b());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f59903h4 = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        this.f59903h4.addUpdateListener(new c());
        this.f59903h4.addListener(new d());
    }

    private View m(int i10) {
        View viewFindViewById = findViewById(i10);
        ImageButton imageButton = (ImageButton) viewFindViewById.findViewById(androidx.media2.widget.n.f.A);
        if (imageButton != null) {
            imageButton.setOnClickListener(this.f59924o4);
        }
        ImageButton imageButton2 = (ImageButton) viewFindViewById.findViewById(androidx.media2.widget.n.f.f60094p);
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(this.f59931q4);
        }
        ImageButton imageButton3 = (ImageButton) viewFindViewById.findViewById(androidx.media2.widget.n.f.E);
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(this.f59929p4);
        }
        ImageButton imageButton4 = (ImageButton) viewFindViewById.findViewById(androidx.media2.widget.n.f.f60102x);
        if (imageButton4 != null) {
            imageButton4.setOnClickListener(this.f59933r4);
        }
        ImageButton imageButton5 = (ImageButton) viewFindViewById.findViewById(androidx.media2.widget.n.f.B);
        if (imageButton5 != null) {
            imageButton5.setOnClickListener(this.f59936s4);
        }
        return viewFindViewById;
    }

    private void n() {
        ArrayList arrayList = new ArrayList();
        this.Q3 = arrayList;
        arrayList.add(this.f59890c.getString(androidx.media2.widget.n.h.f60120f));
        this.Q3.add(this.f59890c.getString(androidx.media2.widget.n.h.f60123i));
        ArrayList arrayList2 = new ArrayList();
        this.R3 = arrayList2;
        arrayList2.add(this.f59890c.getString(androidx.media2.widget.n.h.f60118d));
        String string = this.f59890c.getString(androidx.media2.widget.n.h.f60122h);
        this.R3.add(string);
        this.R3.add("");
        ArrayList arrayList3 = new ArrayList();
        this.S3 = arrayList3;
        arrayList3.add(Integer.valueOf(androidx.media2.widget.n.e.f60059c));
        this.S3.add(Integer.valueOf(androidx.media2.widget.n.e.f60075s));
        ArrayList arrayList4 = new ArrayList();
        this.X3 = arrayList4;
        arrayList4.add(this.f59890c.getString(androidx.media2.widget.n.h.f60118d));
        ArrayList arrayList5 = new ArrayList(Arrays.asList(this.f59890c.getStringArray(androidx.media2.widget.n.a.f60017a)));
        this.Y3 = arrayList5;
        arrayList5.add(3, string);
        this.f59919n = 3;
        this.Z3 = new ArrayList();
        for (int i10 : this.f59890c.getIntArray(androidx.media2.widget.n.a.f60018b)) {
            this.Z3.add(Integer.valueOf(i10));
        }
        this.f59887a4 = -1;
    }

    private boolean o() {
        return !i() && this.V3.size() > 0;
    }

    private void q(View view, int i10, int i11) {
        view.layout(i10, i11, view.getMeasuredWidth() + i10, view.getMeasuredHeight() + i11);
    }

    private void y() {
        if (this.f59934s == 3) {
            return;
        }
        removeCallbacks(this.f59915l4);
        removeCallbacks(this.f59918m4);
        post(this.f59909j4);
    }

    void A() {
        f();
        if (this.f59892d.A()) {
            this.f59892d.C();
            E(1);
        } else {
            if (this.f59927p2) {
                this.f59892d.E(0L);
            }
            this.f59892d.D();
            E(0);
        }
    }

    void B() {
        f();
        boolean zB = this.f59892d.b();
        boolean zC = this.f59892d.c();
        boolean zD = this.f59892d.d();
        boolean zH = this.f59892d.h();
        boolean zG = this.f59892d.g();
        boolean zE = this.f59892d.e();
        int size = this.f59917m3.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = this.f59917m3.keyAt(i10);
            ImageButton imageButtonG = g(iKeyAt, androidx.media2.widget.n.f.A);
            if (imageButtonG != null) {
                imageButtonG.setVisibility(zB ? 0 : 8);
            }
            ImageButton imageButtonG2 = g(iKeyAt, androidx.media2.widget.n.f.E);
            if (imageButtonG2 != null) {
                imageButtonG2.setVisibility(zC ? 0 : 8);
            }
            ImageButton imageButtonG3 = g(iKeyAt, androidx.media2.widget.n.f.f60094p);
            if (imageButtonG3 != null) {
                imageButtonG3.setVisibility(zD ? 0 : 8);
            }
            ImageButton imageButtonG4 = g(iKeyAt, androidx.media2.widget.n.f.B);
            if (imageButtonG4 != null) {
                imageButtonG4.setVisibility(zH ? 0 : 8);
            }
            ImageButton imageButtonG5 = g(iKeyAt, androidx.media2.widget.n.f.f60102x);
            if (imageButtonG5 != null) {
                imageButtonG5.setVisibility(zG ? 0 : 8);
            }
        }
        this.f59902h3 = zE;
        this.f59948x3.setEnabled(zE);
        I();
    }

    void C() {
        f();
        if (this.f59905i3) {
            h(androidx.media2.widget.n.f.E).setVisibility(8);
            h(androidx.media2.widget.n.f.f60094p).setVisibility(8);
            h(androidx.media2.widget.n.f.B).setVisibility(8);
            h(androidx.media2.widget.n.f.f60102x).setVisibility(0);
            h(androidx.media2.widget.n.f.f60102x).setEnabled(false);
            h(androidx.media2.widget.n.f.f60102x).setColorFilter(androidx.media2.widget.n.c.f60024d);
            this.B3.setVisibility(8);
            this.E3.setVisibility(0);
            this.L3.setVisibility(0);
            this.f59928p3.setVisibility(0);
            this.f59948x3.setEnabled(false);
            return;
        }
        h(androidx.media2.widget.n.f.E).setVisibility(this.f59892d.c() ? 0 : 8);
        h(androidx.media2.widget.n.f.f60094p).setVisibility(this.f59892d.d() ? 0 : 8);
        h(androidx.media2.widget.n.f.B).setVisibility(this.f59892d.h() ? 0 : 8);
        h(androidx.media2.widget.n.f.f60102x).setVisibility(this.f59892d.g() ? 0 : 8);
        h(androidx.media2.widget.n.f.f60102x).setEnabled(true);
        h(androidx.media2.widget.n.f.f60102x).clearColorFilter();
        this.B3.setVisibility(0);
        this.E3.setVisibility(8);
        this.L3.setVisibility(8);
        this.f59928p3.setVisibility(8);
        this.f59948x3.setEnabled(this.f59902h3);
    }

    void E(int i10) {
        Drawable drawableL;
        String string;
        ImageButton imageButtonG = g(this.f59922o, androidx.media2.widget.n.f.A);
        if (imageButtonG == null) {
            return;
        }
        if (i10 == 0) {
            drawableL = androidx.core.content.d.l(getContext(), androidx.media2.widget.n.e.f60068l);
            string = this.f59890c.getString(androidx.media2.widget.n.h.B);
        } else if (i10 == 1) {
            drawableL = androidx.core.content.d.l(getContext(), androidx.media2.widget.n.e.f60069m);
            string = this.f59890c.getString(androidx.media2.widget.n.h.C);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("unknown type " + i10);
            }
            drawableL = androidx.core.content.d.l(getContext(), androidx.media2.widget.n.e.f60070n);
            string = this.f59890c.getString(androidx.media2.widget.n.h.F);
        }
        imageButtonG.setImageDrawable(drawableL);
        imageButtonG.setContentDescription(string);
    }

    void F(int i10, int i11) {
        int size = this.f59917m3.size();
        for (int i12 = 0; i12 < size; i12++) {
            int iKeyAt = this.f59917m3.keyAt(i12);
            ImageButton imageButtonG = g(iKeyAt, androidx.media2.widget.n.f.B);
            if (imageButtonG != null) {
                if (i10 > -1) {
                    imageButtonG.setAlpha(1.0f);
                    imageButtonG.setEnabled(true);
                } else {
                    imageButtonG.setAlpha(0.5f);
                    imageButtonG.setEnabled(false);
                }
            }
            ImageButton imageButtonG2 = g(iKeyAt, androidx.media2.widget.n.f.f60102x);
            if (imageButtonG2 != null) {
                if (i11 > -1) {
                    imageButtonG2.setAlpha(1.0f);
                    imageButtonG2.setEnabled(true);
                } else {
                    imageButtonG2.setAlpha(0.5f);
                    imageButtonG2.setEnabled(false);
                }
            }
        }
    }

    void G(boolean z10) {
        ImageButton imageButtonG = g(this.f59922o, androidx.media2.widget.n.f.f60094p);
        if (z10) {
            this.f59927p2 = true;
            E(2);
            if (imageButtonG != null) {
                imageButtonG.setAlpha(0.5f);
                imageButtonG.setEnabled(false);
            }
        } else {
            this.f59927p2 = false;
            androidx.media2.widget.m mVar = this.f59892d;
            if (mVar == null || !mVar.A()) {
                E(1);
            } else {
                E(0);
            }
            if (imageButtonG != null) {
                imageButtonG.setAlpha(1.0f);
                imageButtonG.setEnabled(true);
            }
        }
    }

    void H(int i10, String str) {
        this.f59919n = i10;
        this.R3.set(1, str);
        this.P3.c(this.Y3);
        this.P3.b(this.f59919n);
    }

    void I() {
        if (!this.f59892d.f() || (this.U3 == 0 && this.V3.isEmpty() && this.W3.isEmpty())) {
            this.J3.setVisibility(8);
            this.J3.setEnabled(false);
            return;
        }
        if (!this.W3.isEmpty()) {
            this.J3.setVisibility(0);
            this.J3.setAlpha(1.0f);
            this.J3.setEnabled(true);
        } else if (o()) {
            this.J3.setVisibility(8);
            this.J3.setEnabled(false);
        } else {
            this.J3.setVisibility(0);
            this.J3.setAlpha(0.5f);
            this.J3.setEnabled(false);
        }
    }

    void J(MediaItem mediaItem) {
        if (mediaItem == null) {
            this.f59948x3.setProgress(0);
            this.D3.setText(this.f59890c.getString(androidx.media2.widget.n.h.f60127m));
            this.C3.setText(this.f59890c.getString(androidx.media2.widget.n.h.f60127m));
        } else {
            f();
            long jQ = this.f59892d.q();
            if (jQ > 0) {
                this.f59937t = jQ;
                w();
            }
        }
    }

    void K(MediaItem mediaItem) {
        if (mediaItem == null) {
            this.f59923o3.setText((CharSequence) null);
            return;
        }
        if (!o()) {
            CharSequence charSequenceW = this.f59892d.w();
            if (charSequenceW == null) {
                charSequenceW = this.f59890c.getString(androidx.media2.widget.n.h.f60139y);
            }
            this.f59923o3.setText(charSequenceW.toString());
            return;
        }
        CharSequence charSequenceW2 = this.f59892d.w();
        if (charSequenceW2 == null) {
            charSequenceW2 = this.f59890c.getString(androidx.media2.widget.n.h.f60137w);
        }
        CharSequence charSequenceL = this.f59892d.l();
        if (charSequenceL == null) {
            charSequenceL = this.f59890c.getString(androidx.media2.widget.n.h.f60136v);
        }
        this.f59923o3.setText(charSequenceW2.toString() + " - " + charSequenceL.toString());
    }

    void L(androidx.media2.widget.m mVar, List<SessionPlayer.TrackInfo> list) {
        this.U3 = 0;
        this.V3 = new ArrayList();
        this.W3 = new ArrayList();
        this.f59916m = 0;
        this.f59913l = -1;
        SessionPlayer.TrackInfo trackInfoV = mVar.v(2);
        SessionPlayer.TrackInfo trackInfoV2 = mVar.v(4);
        for (int i10 = 0; i10 < list.size(); i10++) {
            int iM = list.get(i10).m();
            if (iM == 1) {
                this.U3++;
            } else if (iM == 2) {
                if (list.get(i10).equals(trackInfoV)) {
                    this.f59916m = this.V3.size();
                }
                this.V3.add(list.get(i10));
            } else if (iM == 4) {
                if (list.get(i10).equals(trackInfoV2)) {
                    this.f59913l = this.W3.size();
                }
                this.W3.add(list.get(i10));
            }
        }
        this.X3 = new ArrayList();
        if (this.V3.isEmpty()) {
            this.X3.add(this.f59890c.getString(androidx.media2.widget.n.h.f60118d));
        } else {
            int i11 = 0;
            while (i11 < this.V3.size()) {
                i11++;
                this.X3.add(this.f59890c.getString(androidx.media2.widget.n.h.f60119e, Integer.valueOf(i11)));
            }
        }
        this.R3.set(0, this.X3.get(this.f59916m));
        this.T3 = new ArrayList();
        if (!this.W3.isEmpty()) {
            this.T3.add(this.f59890c.getString(androidx.media2.widget.n.h.f60124j));
            for (int i12 = 0; i12 < this.W3.size(); i12++) {
                String iSO3Language = this.W3.get(i12).l().getISO3Language();
                this.T3.add(iSO3Language.equals("und") ? this.f59890c.getString(androidx.media2.widget.n.h.f60126l, Integer.valueOf(i12 + 1)) : this.f59890c.getString(androidx.media2.widget.n.h.f60125k, Integer.valueOf(i12 + 1), iSO3Language));
            }
        }
        I();
    }

    @Override // androidx.media2.widget.k
    void b(boolean z10) {
        super.b(z10);
        if (this.f59892d == null) {
            return;
        }
        if (!z10) {
            removeCallbacks(this.f59906i4);
        } else {
            removeCallbacks(this.f59906i4);
            post(this.f59906i4);
        }
    }

    void c(float f10) {
        this.I3.setTranslationX(((int) (this.I3.getWidth() * f10)) * (-1));
        float f11 = 1.0f - f10;
        this.B3.setAlpha(f11);
        this.H3.setAlpha(f11);
        this.A3.setTranslationX(((int) (h(androidx.media2.widget.n.f.A).getLeft() * f10)) * (-1));
        h(androidx.media2.widget.n.f.f60094p).setAlpha(f11);
    }

    void d() {
        this.f59908j3 = true;
        this.N3.dismiss();
    }

    void e(BaseAdapter baseAdapter) {
        this.M3.setAdapter((ListAdapter) baseAdapter);
        this.N3.setWidth(this.f59922o == 0 ? this.f59898g : this.f59901h);
        int height = getHeight() - (this.f59907j * 2);
        int count = baseAdapter.getCount() * this.f59904i;
        if (count < height) {
            height = count;
        }
        this.N3.setHeight(height);
        this.f59908j3 = false;
        this.N3.dismiss();
        if (height > 0) {
            this.N3.showAsDropDown(this, (getWidth() - this.N3.getWidth()) - this.f59907j, (-this.N3.getHeight()) - this.f59907j);
            this.f59908j3 = true;
        }
    }

    void f() {
        if (this.f59892d == null) {
            throw new IllegalStateException("mPlayer must not be null");
        }
    }

    @p0
    ImageButton g(int i10, @androidx.annotation.d0 int i11) {
        View view = this.f59917m3.get(i10);
        if (view == null) {
            return null;
        }
        return (ImageButton) view.findViewById(i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.media2.widget.MediaControlView";
    }

    long getLatestSeekPosition() {
        f();
        long j10 = this.f59925p0;
        if (j10 != -1) {
            return j10;
        }
        long j11 = this.f59945w;
        return j11 != -1 ? j11 : this.f59892d.p();
    }

    @NonNull
    ImageButton h(@androidx.annotation.d0 int i10) {
        ImageButton imageButtonG = g(1, i10);
        if (imageButtonG != null) {
            return imageButtonG;
        }
        throw new IllegalArgumentException("Couldn't find a view that has the given id");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.media2.widget.m mVar = this.f59892d;
        if (mVar != null) {
            mVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.media2.widget.m mVar = this.f59892d;
        if (mVar != null) {
            mVar.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
        int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        int measuredWidth = this.f59952z3.getMeasuredWidth() + this.B3.getMeasuredWidth() + this.H3.getMeasuredWidth();
        int measuredHeight = this.f59920n3.getMeasuredHeight() + this.f59946w3.getMeasuredHeight() + this.f59950y3.getMeasuredHeight();
        int measuredWidth2 = this.B3.getMeasuredWidth() + this.H3.getMeasuredWidth();
        int measuredHeight2 = this.f59920n3.getMeasuredHeight() + this.f59935s3.getMeasuredHeight() + this.f59946w3.getMeasuredHeight() + this.f59950y3.getMeasuredHeight();
        int i15 = 1 << 2;
        if (this.f59905i3 || (measuredWidth <= paddingLeft && measuredHeight <= paddingTop)) {
            i14 = 1;
        } else {
            i14 = (measuredWidth2 > paddingLeft || measuredHeight2 > paddingTop) ? 2 : 0;
        }
        if (this.f59922o != i14) {
            this.f59922o = i14;
            D(i14);
        }
        this.f59920n3.setVisibility(i14 != 2 ? 0 : 4);
        this.f59932r3.setVisibility(i14 != 1 ? 0 : 4);
        this.f59935s3.setVisibility(i14 == 0 ? 0 : 4);
        this.f59938t3.setVisibility(i14 == 2 ? 0 : 4);
        this.f59950y3.setVisibility(i14 != 2 ? 0 : 4);
        this.f59952z3.setVisibility(i14 == 1 ? 0 : 4);
        this.B3.setVisibility(i14 != 2 ? 0 : 4);
        this.H3.setVisibility(i14 != 2 ? 0 : 4);
        this.f59943v3.setVisibility(i14 != 2 ? 4 : 0);
        int paddingLeft2 = getPaddingLeft();
        int i16 = paddingLeft + paddingLeft2;
        int paddingTop2 = getPaddingTop();
        int i17 = paddingTop + paddingTop2;
        q(this.f59920n3, paddingLeft2, paddingTop2);
        q(this.f59930q3, paddingLeft2, paddingTop2);
        View view = this.f59950y3;
        q(view, paddingLeft2, i17 - view.getMeasuredHeight());
        ViewGroup viewGroup = this.f59952z3;
        q(viewGroup, paddingLeft2, i17 - viewGroup.getMeasuredHeight());
        q(this.B3, i14 == 1 ? (i16 - this.H3.getMeasuredWidth()) - this.B3.getMeasuredWidth() : paddingLeft2, i17 - this.B3.getMeasuredHeight());
        ViewGroup viewGroup2 = this.H3;
        q(viewGroup2, i16 - viewGroup2.getMeasuredWidth(), i17 - this.H3.getMeasuredHeight());
        ViewGroup viewGroup3 = this.I3;
        q(viewGroup3, i16, i17 - viewGroup3.getMeasuredHeight());
        ViewGroup viewGroup4 = this.f59946w3;
        q(viewGroup4, paddingLeft2, i14 == 2 ? i17 - viewGroup4.getMeasuredHeight() : (i17 - viewGroup4.getMeasuredHeight()) - this.f59890c.getDimensionPixelSize(androidx.media2.widget.n.d.f60032b));
        ViewGroup viewGroup5 = this.f59940u3;
        q(viewGroup5, paddingLeft2, i17 - viewGroup5.getMeasuredHeight());
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int measuredState;
        int i13;
        int iMakeMeasureSpec;
        int iResolveSize = View.resolveSize(getSuggestedMinimumWidth(), i10);
        int iResolveSize2 = View.resolveSize(getSuggestedMinimumHeight(), i11);
        int paddingLeft = (iResolveSize - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (iResolveSize2 - getPaddingTop()) - getPaddingBottom();
        if (paddingLeft < 0) {
            measuredState = 16777216;
            i12 = 0;
        } else {
            i12 = paddingLeft;
            measuredState = 0;
        }
        if (paddingTop < 0) {
            measuredState |= 256;
            paddingTop = 0;
        }
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i15 = layoutParams.width;
                if (i15 == -1) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
                    i13 = 0;
                } else if (i15 == -2) {
                    i13 = 0;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 0);
                } else {
                    i13 = 0;
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
                }
                int i16 = layoutParams.height;
                childAt.measure(iMakeMeasureSpec, i16 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : i16 == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, i13) : View.MeasureSpec.makeMeasureSpec(i16, 1073741824));
                measuredState |= childAt.getMeasuredState();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iResolveSize, i10, measuredState), View.resolveSizeAndState(iResolveSize2, i11, measuredState << 16));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f59892d == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (!o() || this.f59922o != 1)) {
            if (this.f59934s == 0) {
                j();
            } else {
                y();
            }
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (this.f59892d == null) {
            return super.onTrackballEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 && (!o() || this.f59922o != 1)) {
            if (this.f59934s == 0) {
                j();
            } else {
                y();
            }
        }
        return true;
    }

    @Override // androidx.media2.widget.k, android.view.View
    @w0(24)
    public /* bridge */ /* synthetic */ void onVisibilityAggregated(boolean z10) {
        super.onVisibilityAggregated(z10);
    }

    boolean p() {
        f();
        MediaItem mediaItemN = this.f59892d.n();
        if (mediaItemN instanceof UriMediaItem) {
            return androidx.media2.widget.t.a(((UriMediaItem) mediaItemN).q());
        }
        return false;
    }

    void r(Runnable runnable, long j10) {
        if (j10 != -1) {
            postDelayed(runnable, j10);
        }
    }

    void s() {
        this.Z3.remove(this.f59887a4);
        this.Y3.remove(this.f59887a4);
        this.f59887a4 = -1;
    }

    void setAttachedToVideoView(boolean z10) {
        this.f59888b = z10;
    }

    void setDelayedAnimationInterval(long j10) {
        this.f59942v = j10;
    }

    public void setMediaController(@NonNull MediaController mediaController) {
        if (mediaController == null) {
            throw new NullPointerException("controller must not be null");
        }
        if (this.f59888b) {
            throw new IllegalStateException("It's attached to VideoView. Use VideoView's method.");
        }
        setMediaControllerInternal(mediaController);
    }

    void setMediaControllerInternal(@NonNull MediaController mediaController) {
        androidx.media2.widget.m mVar = this.f59892d;
        if (mVar != null) {
            mVar.j();
        }
        this.f59892d = new androidx.media2.widget.m(mediaController, androidx.core.content.d.o(getContext()), new g0());
        if (u1.R0(this)) {
            this.f59892d.a();
        }
    }

    public void setOnFullScreenListener(@p0 f0 f0Var) {
        if (f0Var == null) {
            this.f59894e = null;
            this.K3.setVisibility(8);
        } else {
            this.f59894e = f0Var;
            this.K3.setVisibility(0);
        }
    }

    public void setPlayer(@NonNull SessionPlayer sessionPlayer) {
        if (sessionPlayer == null) {
            throw new NullPointerException("player must not be null");
        }
        if (this.f59888b) {
            throw new IllegalStateException("It's attached to VideoView. Use VideoView's method.");
        }
        setPlayerInternal(sessionPlayer);
    }

    void setPlayerInternal(@NonNull SessionPlayer sessionPlayer) {
        androidx.media2.widget.m mVar = this.f59892d;
        if (mVar != null) {
            mVar.j();
        }
        this.f59892d = new androidx.media2.widget.m(sessionPlayer, androidx.core.content.d.o(getContext()), new g0());
        if (u1.R0(this)) {
            this.f59892d.a();
        }
    }

    public void t() {
        ImageButton imageButtonG = g(this.f59922o, androidx.media2.widget.n.f.A);
        if (imageButtonG != null) {
            imageButtonG.requestFocus();
        }
    }

    void u() {
        removeCallbacks(this.f59915l4);
        removeCallbacks(this.f59918m4);
        r(this.f59915l4, this.f59942v);
    }

    void v(long j10, boolean z10) {
        f();
        long j11 = this.f59937t;
        this.f59948x3.setProgress(j11 <= 0 ? 0 : (int) ((1000 * j10) / j11));
        this.D3.setText(z(j10));
        if (this.f59945w != -1) {
            this.f59925p0 = j10;
            return;
        }
        this.f59945w = j10;
        if (z10) {
            this.f59892d.E(j10);
        }
    }

    long w() {
        f();
        long jP = this.f59892d.p();
        long j10 = this.f59937t;
        if (jP > j10) {
            jP = j10;
        }
        int i10 = j10 > 0 ? (int) ((jP * 1000) / j10) : 0;
        SeekBar seekBar = this.f59948x3;
        if (seekBar != null && jP != j10) {
            seekBar.setProgress(i10);
            if (this.f59892d.m() < 0) {
                this.f59948x3.setSecondaryProgress(1000);
            } else {
                this.f59948x3.setSecondaryProgress(((int) this.f59892d.m()) * 10);
            }
        }
        TextView textView = this.C3;
        if (textView != null) {
            textView.setText(z(this.f59937t));
        }
        TextView textView2 = this.D3;
        if (textView2 != null) {
            textView2.setText(z(jP));
        }
        if (this.f59905i3) {
            TextView textView3 = this.E3;
            if (textView3 != null) {
                if (jP <= 5000) {
                    if (textView3.getVisibility() == 8) {
                        this.E3.setVisibility(0);
                    }
                    this.E3.setText(this.f59890c.getString(androidx.media2.widget.n.h.f60116b, Long.valueOf(((5000 - jP) / 1000) + 1)));
                } else if (textView3.getVisibility() == 0) {
                    this.E3.setVisibility(8);
                    h(androidx.media2.widget.n.f.f60102x).setEnabled(true);
                    h(androidx.media2.widget.n.f.f60102x).clearColorFilter();
                }
            }
            if (this.L3 != null) {
                long j11 = this.f59937t;
                this.L3.setText(this.f59890c.getString(androidx.media2.widget.n.h.f60115a, z(j11 - jP >= 0 ? j11 - jP : 0L)));
            }
        }
        return jP;
    }

    boolean x() {
        if ((!o() || this.f59922o != 1) && !this.f59896f.isTouchExplorationEnabled() && this.f59892d.t() != 3 && this.f59892d.t() != 0) {
            return false;
        }
        return true;
    }

    String z(long j10) {
        long j11 = j10 / 1000;
        long j12 = j11 % 60;
        long j13 = (j11 / 60) % 60;
        long j14 = j11 / 3600;
        this.F3.setLength(0);
        return j14 > 0 ? this.G3.format("%d:%02d:%02d", Long.valueOf(j14), Long.valueOf(j13), Long.valueOf(j12)).toString() : this.G3.format("%02d:%02d", Long.valueOf(j13), Long.valueOf(j12)).toString();
    }

    public i(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f59888b = false;
        this.f59922o = -1;
        this.f59917m3 = new SparseArray<>();
        this.V3 = new ArrayList();
        this.W3 = new ArrayList();
        this.f59906i4 = new e();
        this.f59909j4 = new f();
        this.f59912k4 = new g();
        this.f59915l4 = new h();
        this.f59918m4 = new RunnableC0563i();
        this.f59921n4 = new j();
        this.f59924o4 = new l();
        this.f59929p4 = new m();
        this.f59931q4 = new n();
        this.f59933r4 = new o();
        this.f59936s4 = new p();
        this.f59939t4 = new q();
        this.f59941u4 = new r();
        this.f59944v4 = new s();
        this.f59947w4 = new t();
        this.f59949x4 = new u();
        this.f59951y4 = new w();
        this.f59953z4 = new x();
        this.f59890c = context.getResources();
        View.inflate(context, androidx.media2.widget.n.g.f60107c, this);
        l();
        this.f59942v = 2000L;
        this.f59896f = (AccessibilityManager) context.getSystemService("accessibility");
    }
}
