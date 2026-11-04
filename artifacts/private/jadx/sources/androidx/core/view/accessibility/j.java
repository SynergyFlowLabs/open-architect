package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.r0;
import androidx.annotation.w0;
import java.lang.ref.WeakReference;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class j {
    public static final int A = 1;
    public static final int A0 = 32;
    public static final int B = 2;

    @e.a({"MinMaxConstant"})
    public static final int B0 = 50;
    public static final int C = 4;
    private static int C0 = 0;
    public static final int D = 8;
    public static final int E = 16;
    public static final int F = 32;
    public static final int G = 64;
    public static final int H = 128;
    public static final int I = 256;
    public static final int J = 512;
    public static final int K = 1024;
    public static final int L = 2048;
    public static final int M = 4096;
    public static final int N = 8192;
    public static final int O = 16384;
    public static final int P = 32768;
    public static final int Q = 65536;
    public static final int R = 131072;
    public static final int S = 262144;
    public static final int T = 524288;
    public static final int U = 1048576;
    public static final int V = 2097152;
    public static final String W = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String X = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String Y = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String Z = "ACTION_ARGUMENT_SELECTION_START_INT";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f48490a0 = "ACTION_ARGUMENT_SELECTION_END_INT";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f48491b0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f48492c0 = "android.view.accessibility.action.ARGUMENT_ROW_INT";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f48493d = "AccessibilityNodeInfo.roleDescription";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f48494d0 = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f48495e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f48496e0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f48497f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f48498f0 = "ACTION_ARGUMENT_MOVE_WINDOW_X";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f48499g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f48500g0 = "ACTION_ARGUMENT_MOVE_WINDOW_Y";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f48501h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    @e.a({"ActionValue"})
    public static final String f48502h0 = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f48503i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f48504i0 = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f48505j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f48506j0 = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f48507k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final int f48508k0 = 1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f48509l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final int f48510l0 = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f48511m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f48512m0 = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f48513n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f48514n0 = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f48515o = "androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f48516o0 = 4;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f48517p = "androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f48518p0 = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f48519q = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f48520q0 = 16;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f48521r = "androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f48522r0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f48523s = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f48524s0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f48525t = 2;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f48526t0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f48527u = 4;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final int f48528u0 = 20000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f48529v = 8;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final int f48530v0 = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f48531w = 32;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int f48532w0 = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f48533x = 64;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int f48534x0 = 4;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f48535y = 8388608;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f48536y0 = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f48537z = 67108864;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final int f48538z0 = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f48539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int f48540b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48541c = -1;

    public static class a {
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;

        @NonNull
        public static final a H;

        @NonNull
        public static final a I;

        @NonNull
        public static final a J;

        @NonNull
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;

        @NonNull
        public static final a Q;

        @NonNull
        public static final a R;

        @NonNull
        public static final a S;

        @NonNull
        public static final a T;

        @NonNull
        public static final a U;

        @NonNull
        public static final a V;

        @NonNull
        @r0(markerClass = {androidx.core.os.b.InterfaceC0396b.class})
        public static final a W;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f48542e = "A11yActionCompat";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f48564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends m.a> f48566c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        protected final m f48567d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f48543f = new a(1, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f48544g = new a(2, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f48545h = new a(4, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f48546i = new a(8, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f48547j = new a(16, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f48548k = new a(32, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f48549l = new a(64, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f48550m = new a(128, null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f48551n = new a(256, (CharSequence) null, (Class<? extends m.a>) m.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f48552o = new a(512, (CharSequence) null, (Class<? extends m.a>) m.b.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f48553p = new a(1024, (CharSequence) null, (Class<? extends m.a>) m.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f48554q = new a(2048, (CharSequence) null, (Class<? extends m.a>) m.c.class);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f48555r = new a(4096, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f48556s = new a(8192, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f48557t = new a(16384, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f48558u = new a(32768, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f48559v = new a(65536, null);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f48560w = new a(131072, (CharSequence) null, (Class<? extends m.a>) m.g.class);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f48561x = new a(262144, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f48562y = new a(524288, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f48563z = new a(1048576, null);
        public static final a A = new a(2097152, (CharSequence) null, (Class<? extends m.a>) m.h.class);

        static {
            int i10 = Build.VERSION.SDK_INT;
            B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, m.e.class);
            D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            H = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp, null, null, null);
            I = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown, null, null, null);
            J = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft, null, null, null);
            K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight, null, null, null);
            L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            M = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, m.f.class);
            N = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, null, m.d.class);
            O = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip, null, null, null);
            P = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            R = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            U = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            V = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            W = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, m mVar) {
            return new a(null, this.f48565b, charSequence, mVar, this.f48566c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f48564a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f48564a).getLabel();
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public boolean d(View view, Bundle bundle) {
            if (this.f48567d == null) {
                return false;
            }
            Class<? extends m.a> cls = this.f48566c;
            m.a aVar = null;
            if (cls != null) {
                try {
                    m.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception unused) {
                        aVar = aVarNewInstance;
                        Class<? extends m.a> cls2 = this.f48566c;
                        if (cls2 != null) {
                            cls2.getName();
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            return this.f48567d.a(view, aVar);
        }

        public boolean equals(@p0 Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f48564a;
            if (obj2 == null) {
                if (aVar.f48564a != null) {
                    return false;
                }
            } else if (!obj2.equals(aVar.f48564a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f48564a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @NonNull
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strO = j.o(this.f48565b);
            if (strO.equals("ACTION_UNKNOWN") && c() != null) {
                strO = c().toString();
            }
            sb2.append(strO);
            return sb2.toString();
        }

        @b1({b1.a.LIBRARY_GROUP_PREFIX})
        public a(int i10, CharSequence charSequence, m mVar) {
            this(null, i10, charSequence, mVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class<? extends m.a> cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, m mVar, Class<? extends m.a> cls) {
            this.f48565b = i10;
            this.f48567d = mVar;
            if (obj == null) {
                this.f48564a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f48564a = obj;
            }
            this.f48566c = cls;
        }
    }

    @w0(30)
    private static class b {
        private b() {
        }

        public static Object a(int i10, float f10, float f11, float f12) {
            return new AccessibilityNodeInfo.RangeInfo(i10, f10, f11, f12);
        }

        public static CharSequence b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void c(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    @w0(33)
    private static class c {
        private c() {
        }

        public static g a(boolean z10, int i10, int i11, int i12, int i13, boolean z11, String str, String str2) {
            return new g(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z10).setColumnIndex(i10).setRowIndex(i11).setColumnSpan(i12).setRowSpan(i13).setSelected(z11).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static j b(AccessibilityNodeInfo accessibilityNodeInfo, int i10, int i11) {
            return j.s2(accessibilityNodeInfo.getChild(i10, i11));
        }

        public static String c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }

        public static String d(Object obj) {
            return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static AccessibilityNodeInfo.ExtraRenderingInfo e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static j f(AccessibilityNodeInfo accessibilityNodeInfo, int i10) {
            return j.s2(accessibilityNodeInfo.getParent(i10));
        }

        public static String g(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setTextSelectable(z10);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }
    }

    @w0(34)
    private static class d {
        private d() {
        }

        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static long d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static boolean f(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void g(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z10);
        }

        public static void h(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static void i(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void j(AccessibilityNodeInfo accessibilityNodeInfo, long j10) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j10));
        }

        public static void k(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z10) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z10);
        }

        public static void l(AccessibilityNodeInfo accessibilityNodeInfo, boolean z10) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z10);
        }
    }

    @w0(35)
    private static class e {
        private e() {
        }

        public static f a(int i10, int i11, boolean z10, int i12, int i13, int i14) {
            return new f.a().f(i10).b(i11).c(z10).g(i12).e(i13).d(i14).a();
        }

        public static int b(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getImportantForAccessibilityItemCount();
        }

        public static int c(Object obj) {
            return ((AccessibilityNodeInfo.CollectionInfo) obj).getItemCount();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f48568b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f48569c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f48570d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f48571e = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f48572a;

        public static final class a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f48576d;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f48573a = 0;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f48574b = 0;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f48575c = false;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f48577e = -1;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private int f48578f = -1;

            @NonNull
            public f a() {
                return Build.VERSION.SDK_INT >= 35 ? e.a(this.f48573a, this.f48574b, this.f48575c, this.f48576d, this.f48577e, this.f48578f) : f.h(this.f48573a, this.f48574b, this.f48575c, this.f48576d);
            }

            @NonNull
            public a b(int i10) {
                this.f48574b = i10;
                return this;
            }

            @NonNull
            public a c(boolean z10) {
                this.f48575c = z10;
                return this;
            }

            @NonNull
            public a d(int i10) {
                this.f48578f = i10;
                return this;
            }

            @NonNull
            public a e(int i10) {
                this.f48577e = i10;
                return this;
            }

            @NonNull
            public a f(int i10) {
                this.f48573a = i10;
                return this;
            }

            @NonNull
            public a g(int i10) {
                this.f48576d = i10;
                return this;
            }
        }

        f(Object obj) {
            this.f48572a = obj;
        }

        public static f g(int i10, int i11, boolean z10) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static f h(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f48572a).getColumnCount();
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 35) {
                return e.b(this.f48572a);
            }
            return -1;
        }

        public int c() {
            if (Build.VERSION.SDK_INT >= 35) {
                return e.c(this.f48572a);
            }
            return -1;
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f48572a).getRowCount();
        }

        public int e() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f48572a).getSelectionMode();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f48572a).isHierarchical();
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f48579a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f48580a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f48581b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f48582c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f48583d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f48584e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f48585f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private String f48586g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private String f48587h;

            @NonNull
            public g a() {
                return Build.VERSION.SDK_INT >= 33 ? c.a(this.f48580a, this.f48581b, this.f48582c, this.f48583d, this.f48584e, this.f48585f, this.f48586g, this.f48587h) : new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(this.f48582c, this.f48584e, this.f48581b, this.f48583d, this.f48580a, this.f48585f));
            }

            @NonNull
            public a b(int i10) {
                this.f48581b = i10;
                return this;
            }

            @NonNull
            public a c(int i10) {
                this.f48583d = i10;
                return this;
            }

            @NonNull
            public a d(@p0 String str) {
                this.f48587h = str;
                return this;
            }

            @NonNull
            public a e(boolean z10) {
                this.f48580a = z10;
                return this;
            }

            @NonNull
            public a f(int i10) {
                this.f48582c = i10;
                return this;
            }

            @NonNull
            public a g(int i10) {
                this.f48584e = i10;
                return this;
            }

            @NonNull
            public a h(@p0 String str) {
                this.f48586g = str;
                return this;
            }

            @NonNull
            public a i(boolean z10) {
                this.f48585f = z10;
                return this;
            }
        }

        g(Object obj) {
            this.f48579a = obj;
        }

        public static g i(int i10, int i11, int i12, int i13, boolean z10) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static g j(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f48579a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f48579a).getColumnSpan();
        }

        @p0
        public String c() {
            if (Build.VERSION.SDK_INT >= 33) {
                return c.c(this.f48579a);
            }
            return null;
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f48579a).getRowIndex();
        }

        public int e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f48579a).getRowSpan();
        }

        @p0
        public String f() {
            if (Build.VERSION.SDK_INT >= 33) {
                return c.d(this.f48579a);
            }
            return null;
        }

        @Deprecated
        public boolean g() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f48579a).isHeading();
        }

        public boolean h() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f48579a).isSelected();
        }
    }

    @Deprecated
    public j(Object obj) {
        this.f48539a = (AccessibilityNodeInfo) obj;
    }

    public static j N0() {
        return r2(AccessibilityNodeInfo.obtain());
    }

    public static j O0(View view) {
        return r2(AccessibilityNodeInfo.obtain(view));
    }

    public static j P0(View view, int i10) {
        return s2(AccessibilityNodeInfo.obtain(view, i10));
    }

    public static j Q0(j jVar) {
        return r2(AccessibilityNodeInfo.obtain(jVar.f48539a));
    }

    private SparseArray<WeakReference<ClickableSpan>> R(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayY = Y(view);
        if (sparseArrayY == null) {
            sparseArrayY = new SparseArray<>();
            view.setTag(i1.a.e.f286782g0, sparseArrayY);
        }
        return sparseArrayY;
    }

    private SparseArray<WeakReference<ClickableSpan>> Y(View view) {
        return (SparseArray) view.getTag(i1.a.e.f286782g0);
    }

    private void Y0(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayY = Y(view);
        if (sparseArrayY != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayY.size(); i10++) {
                if (sparseArrayY.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayY.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void c1(int i10, boolean z10) {
        Bundle bundleH = H();
        if (bundleH != null) {
            int i11 = bundleH.getInt(f48501h, 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleH.putInt(f48501h, i10 | i11);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        i(f48505j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(f48507k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(f48509l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(f48503i).add(Integer.valueOf(i10));
    }

    private void h() {
        this.f48539a.getExtras().remove(f48505j);
        this.f48539a.getExtras().remove(f48507k);
        this.f48539a.getExtras().remove(f48509l);
        this.f48539a.getExtras().remove(f48503i);
    }

    private List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = this.f48539a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f48539a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    private boolean m0() {
        return !i(f48505j).isEmpty();
    }

    private int n0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals(sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = C0;
        C0 = i11 + 1;
        return i11;
    }

    static String o(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean r(int i10) {
        Bundle bundleH = H();
        return bundleH != null && (bundleH.getInt(f48501h, 0) & i10) == i10;
    }

    public static j r2(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new j(accessibilityNodeInfo);
    }

    static j s2(Object obj) {
        if (obj != null) {
            return new j(obj);
        }
        return null;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] z(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public f A() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f48539a.getCollectionInfo();
        if (collectionInfo != null) {
            return new f(collectionInfo);
        }
        return null;
    }

    public boolean A0() {
        return r(67108864);
    }

    public void A1(@p0 CharSequence charSequence) {
        this.f48539a.setHintText(charSequence);
    }

    public g B() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f48539a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new g(collectionItemInfo);
        }
        return null;
    }

    public boolean B0() {
        return this.f48539a.isHeading();
    }

    public void B1(boolean z10) {
        this.f48539a.setImportantForAccessibility(z10);
    }

    @p0
    public CharSequence C() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f48539a) : this.f48539a.getExtras().getCharSequence(f48517p);
    }

    public boolean C0() {
        return this.f48539a.isImportantForAccessibility();
    }

    public void C1(int i10) {
        this.f48539a.setInputType(i10);
    }

    public CharSequence D() {
        return this.f48539a.getContentDescription();
    }

    public boolean D0() {
        return this.f48539a.isLongClickable();
    }

    public void D1(View view) {
        this.f48539a.setLabelFor(view);
    }

    public int E() {
        return this.f48539a.getDrawingOrder();
    }

    public boolean E0() {
        return this.f48539a.isMultiLine();
    }

    public void E1(View view, int i10) {
        this.f48539a.setLabelFor(view, i10);
    }

    public CharSequence F() {
        return this.f48539a.getError();
    }

    public boolean F0() {
        return this.f48539a.isPassword();
    }

    public void F1(View view) {
        this.f48539a.setLabeledBy(view);
    }

    @p0
    public AccessibilityNodeInfo.ExtraRenderingInfo G() {
        if (Build.VERSION.SDK_INT >= 33) {
            return c.e(this.f48539a);
        }
        return null;
    }

    public boolean G0() {
        return this.f48539a.isScreenReaderFocusable();
    }

    public void G1(View view, int i10) {
        this.f48539a.setLabeledBy(view, i10);
    }

    public Bundle H() {
        return this.f48539a.getExtras();
    }

    public boolean H0() {
        return this.f48539a.isScrollable();
    }

    public void H1(int i10) {
        this.f48539a.setLiveRegion(i10);
    }

    @p0
    public CharSequence I() {
        return this.f48539a.getHintText();
    }

    public boolean I0() {
        return this.f48539a.isSelected();
    }

    public void I1(boolean z10) {
        this.f48539a.setLongClickable(z10);
    }

    @Deprecated
    public Object J() {
        return this.f48539a;
    }

    public boolean J0() {
        return this.f48539a.isShowingHintText();
    }

    public void J1(int i10) {
        this.f48539a.setMaxTextLength(i10);
    }

    public int K() {
        return this.f48539a.getInputType();
    }

    public boolean K0() {
        return this.f48539a.isTextEntryKey();
    }

    public void K1(long j10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.j(this.f48539a, j10);
        } else {
            this.f48539a.getExtras().putLong(f48521r, j10);
        }
    }

    public j L() {
        return s2(this.f48539a.getLabelFor());
    }

    public boolean L0() {
        return Build.VERSION.SDK_INT >= 33 ? c.h(this.f48539a) : r(8388608);
    }

    public void L1(int i10) {
        this.f48539a.setMovementGranularities(i10);
    }

    public j M() {
        return s2(this.f48539a.getLabeledBy());
    }

    public boolean M0() {
        return this.f48539a.isVisibleToUser();
    }

    public void M1(boolean z10) {
        this.f48539a.setMultiLine(z10);
    }

    public int N() {
        return this.f48539a.getLiveRegion();
    }

    public void N1(CharSequence charSequence) {
        this.f48539a.setPackageName(charSequence);
    }

    public int O() {
        return this.f48539a.getMaxTextLength();
    }

    public void O1(@p0 CharSequence charSequence) {
        this.f48539a.setPaneTitle(charSequence);
    }

    public long P() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f48539a) : this.f48539a.getExtras().getLong(f48521r);
    }

    public void P1(View view) {
        this.f48540b = -1;
        this.f48539a.setParent(view);
    }

    public int Q() {
        return this.f48539a.getMovementGranularities();
    }

    public void Q1(View view, int i10) {
        this.f48540b = i10;
        this.f48539a.setParent(view, i10);
    }

    public boolean R0(int i10) {
        return this.f48539a.performAction(i10);
    }

    public void R1(boolean z10) {
        this.f48539a.setPassword(z10);
    }

    public CharSequence S() {
        return this.f48539a.getPackageName();
    }

    public boolean S0(int i10, Bundle bundle) {
        return this.f48539a.performAction(i10, bundle);
    }

    public void S1(@NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.k(this.f48539a, view, z10);
        }
    }

    @p0
    public CharSequence T() {
        return this.f48539a.getPaneTitle();
    }

    @Deprecated
    public void T0() {
    }

    public void T1(h hVar) {
        this.f48539a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) hVar.f48591a);
    }

    public j U() {
        return s2(this.f48539a.getParent());
    }

    public boolean U0() {
        return this.f48539a.refresh();
    }

    @e.a({"GetterSetterNames"})
    public void U1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.l(this.f48539a, z10);
        } else {
            c1(32, z10);
        }
    }

    @p0
    public j V(int i10) {
        return Build.VERSION.SDK_INT >= 33 ? c.f(this.f48539a, i10) : U();
    }

    public boolean V0(a aVar) {
        return this.f48539a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f48564a);
    }

    public void V1(@p0 CharSequence charSequence) {
        this.f48539a.getExtras().putCharSequence(f48493d, charSequence);
    }

    public h W() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f48539a.getRangeInfo();
        if (rangeInfo != null) {
            return new h(rangeInfo);
        }
        return null;
    }

    public boolean W0(View view) {
        return this.f48539a.removeChild(view);
    }

    public void W1(boolean z10) {
        this.f48539a.setScreenReaderFocusable(z10);
    }

    @p0
    public CharSequence X() {
        return this.f48539a.getExtras().getCharSequence(f48493d);
    }

    public boolean X0(View view, int i10) {
        return this.f48539a.removeChild(view, i10);
    }

    public void X1(boolean z10) {
        this.f48539a.setScrollable(z10);
    }

    public void Y1(boolean z10) {
        this.f48539a.setSelected(z10);
    }

    @p0
    public CharSequence Z() {
        return Build.VERSION.SDK_INT >= 30 ? b.b(this.f48539a) : this.f48539a.getExtras().getCharSequence(f48513n);
    }

    public void Z0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.g(this.f48539a, z10);
        } else {
            c1(64, z10);
        }
    }

    public void Z1(boolean z10) {
        this.f48539a.setShowingHintText(z10);
    }

    public void a(int i10) {
        this.f48539a.addAction(i10);
    }

    public CharSequence a0() {
        if (!m0()) {
            return this.f48539a.getText();
        }
        List<Integer> listI = i(f48505j);
        List<Integer> listI2 = i(f48507k);
        List<Integer> listI3 = i(f48509l);
        List<Integer> listI4 = i(f48503i);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f48539a.getText(), 0, this.f48539a.getText().length()));
        for (int i10 = 0; i10 < listI.size(); i10++) {
            spannableString.setSpan(new androidx.core.view.accessibility.a(listI4.get(i10).intValue(), this, H().getInt(f48511m)), listI.get(i10).intValue(), listI2.get(i10).intValue(), listI3.get(i10).intValue());
        }
        return spannableString;
    }

    public void a1(boolean z10) {
        this.f48539a.setAccessibilityFocused(z10);
    }

    public void a2(View view) {
        this.f48541c = -1;
        this.f48539a.setSource(view);
    }

    public void b(a aVar) {
        this.f48539a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f48564a);
    }

    public int b0() {
        return this.f48539a.getTextSelectionEnd();
    }

    public void b1(@NonNull List<String> list) {
        this.f48539a.setAvailableExtraData(list);
    }

    public void b2(View view, int i10) {
        this.f48541c = i10;
        this.f48539a.setSource(view, i10);
    }

    public void c(View view) {
        this.f48539a.addChild(view);
    }

    public int c0() {
        return this.f48539a.getTextSelectionStart();
    }

    public void c2(@p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.c(this.f48539a, charSequence);
        } else {
            this.f48539a.getExtras().putCharSequence(f48513n, charSequence);
        }
    }

    public void d(View view, int i10) {
        this.f48539a.addChild(view, i10);
    }

    @p0
    public CharSequence d0() {
        return this.f48539a.getTooltipText();
    }

    @Deprecated
    public void d1(Rect rect) {
        this.f48539a.setBoundsInParent(rect);
    }

    public void d2(CharSequence charSequence) {
        this.f48539a.setText(charSequence);
    }

    @p0
    public i e0() {
        AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo = this.f48539a.getTouchDelegateInfo();
        if (touchDelegateInfo != null) {
            return new i(touchDelegateInfo);
        }
        return null;
    }

    public void e1(Rect rect) {
        this.f48539a.setBoundsInScreen(rect);
    }

    public void e2(boolean z10) {
        this.f48539a.setTextEntryKey(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f48539a;
        if (accessibilityNodeInfo == null) {
            if (jVar.f48539a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(jVar.f48539a)) {
            return false;
        }
        return this.f48541c == jVar.f48541c && this.f48540b == jVar.f48540b;
    }

    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
    }

    public j f0() {
        return s2(this.f48539a.getTraversalAfter());
    }

    public void f1(@NonNull Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.h(this.f48539a, rect);
        } else {
            this.f48539a.getExtras().putParcelable(f48519q, rect);
        }
    }

    public void f2(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.i(this.f48539a, z10);
        } else {
            c1(8388608, z10);
        }
    }

    public boolean g() {
        return this.f48539a.canOpenPopup();
    }

    public j g0() {
        return s2(this.f48539a.getTraversalBefore());
    }

    public void g1(boolean z10) {
        this.f48539a.setCanOpenPopup(z10);
    }

    public void g2(int i10, int i11) {
        this.f48539a.setTextSelection(i10, i11);
    }

    @p0
    public String h0() {
        return Build.VERSION.SDK_INT >= 33 ? c.g(this.f48539a) : this.f48539a.getExtras().getString(f48515o);
    }

    public void h1(boolean z10) {
        this.f48539a.setCheckable(z10);
    }

    public void h2(@p0 CharSequence charSequence) {
        this.f48539a.setTooltipText(charSequence);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f48539a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public String i0() {
        return this.f48539a.getViewIdResourceName();
    }

    public void i1(boolean z10) {
        this.f48539a.setChecked(z10);
    }

    public void i2(@NonNull i iVar) {
        this.f48539a.setTouchDelegateInfo(iVar.f48592a);
    }

    public List<j> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByText = this.f48539a.findAccessibilityNodeInfosByText(str);
        int size = listFindAccessibilityNodeInfosByText.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(r2(listFindAccessibilityNodeInfosByText.get(i10)));
        }
        return arrayList;
    }

    public n j0() {
        return n.y(this.f48539a.getWindow());
    }

    public void j1(CharSequence charSequence) {
        this.f48539a.setClassName(charSequence);
    }

    public void j2(View view) {
        this.f48539a.setTraversalAfter(view);
    }

    public List<j> k(String str) {
        List<AccessibilityNodeInfo> listFindAccessibilityNodeInfosByViewId = this.f48539a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        Iterator<AccessibilityNodeInfo> it = listFindAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(r2(it.next()));
        }
        return arrayList;
    }

    public int k0() {
        return this.f48539a.getWindowId();
    }

    public void k1(boolean z10) {
        this.f48539a.setClickable(z10);
    }

    public void k2(View view, int i10) {
        this.f48539a.setTraversalAfter(view, i10);
    }

    public j l(int i10) {
        return s2(this.f48539a.findFocus(i10));
    }

    @e.a({"KotlinPropertyAccess"})
    public boolean l0() {
        return Build.VERSION.SDK_INT >= 34 ? d.e(this.f48539a) : r(32);
    }

    public void l1(Object obj) {
        this.f48539a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f48572a);
    }

    public void l2(View view) {
        this.f48539a.setTraversalBefore(view);
    }

    public j m(int i10) {
        return s2(this.f48539a.focusSearch(i10));
    }

    public void m1(Object obj) {
        this.f48539a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f48579a);
    }

    public void m2(View view, int i10) {
        this.f48539a.setTraversalBefore(view, i10);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f48539a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public void n1(@p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.i(this.f48539a, charSequence);
        } else {
            this.f48539a.getExtras().putCharSequence(f48517p, charSequence);
        }
    }

    public void n2(@p0 String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.j(this.f48539a, str);
        } else {
            this.f48539a.getExtras().putString(f48515o, str);
        }
    }

    public boolean o0() {
        return Build.VERSION.SDK_INT >= 34 ? d.f(this.f48539a) : r(64);
    }

    public void o1(CharSequence charSequence) {
        this.f48539a.setContentDescription(charSequence);
    }

    public void o2(String str) {
        this.f48539a.setViewIdResourceName(str);
    }

    @Deprecated
    public int p() {
        return this.f48539a.getActions();
    }

    public boolean p0() {
        return this.f48539a.isAccessibilityFocused();
    }

    public void p1(boolean z10) {
        this.f48539a.setContentInvalid(z10);
    }

    public void p2(boolean z10) {
        this.f48539a.setVisibleToUser(z10);
    }

    @NonNull
    public List<String> q() {
        return this.f48539a.getAvailableExtraData();
    }

    public boolean q0() {
        return this.f48539a.isCheckable();
    }

    public void q1(boolean z10) {
        this.f48539a.setContextClickable(z10);
    }

    public AccessibilityNodeInfo q2() {
        return this.f48539a;
    }

    public boolean r0() {
        return this.f48539a.isChecked();
    }

    public void r1(boolean z10) {
        this.f48539a.setDismissable(z10);
    }

    @Deprecated
    public void s(Rect rect) {
        this.f48539a.getBoundsInParent(rect);
    }

    public boolean s0() {
        return this.f48539a.isClickable();
    }

    public void s1(int i10) {
        this.f48539a.setDrawingOrder(i10);
    }

    public void t(Rect rect) {
        this.f48539a.getBoundsInScreen(rect);
    }

    public boolean t0() {
        return this.f48539a.isContentInvalid();
    }

    public void t1(boolean z10) {
        this.f48539a.setEditable(z10);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        s(rect);
        sb2.append("; boundsInParent: " + rect);
        t(rect);
        sb2.append("; boundsInScreen: " + rect);
        u(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(S());
        sb2.append("; className: ");
        sb2.append(y());
        sb2.append("; text: ");
        sb2.append(a0());
        sb2.append("; error: ");
        sb2.append(F());
        sb2.append("; maxTextLength: ");
        sb2.append(O());
        sb2.append("; stateDescription: ");
        sb2.append(Z());
        sb2.append("; contentDescription: ");
        sb2.append(D());
        sb2.append("; tooltipText: ");
        sb2.append(d0());
        sb2.append("; viewIdResName: ");
        sb2.append(i0());
        sb2.append("; uniqueId: ");
        sb2.append(h0());
        sb2.append("; checkable: ");
        sb2.append(q0());
        sb2.append("; checked: ");
        sb2.append(r0());
        sb2.append("; focusable: ");
        sb2.append(y0());
        sb2.append("; focused: ");
        sb2.append(z0());
        sb2.append("; selected: ");
        sb2.append(I0());
        sb2.append("; clickable: ");
        sb2.append(s0());
        sb2.append("; longClickable: ");
        sb2.append(D0());
        sb2.append("; contextClickable: ");
        sb2.append(u0());
        sb2.append("; enabled: ");
        sb2.append(x0());
        sb2.append("; password: ");
        sb2.append(F0());
        sb2.append("; scrollable: " + H0());
        sb2.append("; containerTitle: ");
        sb2.append(C());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(A0());
        sb2.append("; importantForAccessibility: ");
        sb2.append(C0());
        sb2.append("; visible: ");
        sb2.append(M0());
        sb2.append("; isTextSelectable: ");
        sb2.append(L0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(o0());
        sb2.append("; [");
        List<a> listN = n();
        for (int i10 = 0; i10 < listN.size(); i10++) {
            a aVar = listN.get(i10);
            String strO = o(aVar.b());
            if (strO.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strO = aVar.c().toString();
            }
            sb2.append(strO);
            if (i10 != listN.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void u(@NonNull Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f48539a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f48539a.getExtras().getParcelable(f48519q);
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public boolean u0() {
        return this.f48539a.isContextClickable();
    }

    public void u1(boolean z10) {
        this.f48539a.setEnabled(z10);
    }

    public j v(int i10) {
        return s2(this.f48539a.getChild(i10));
    }

    public boolean v0() {
        return this.f48539a.isDismissable();
    }

    public void v1(CharSequence charSequence) {
        this.f48539a.setError(charSequence);
    }

    @p0
    public j w(int i10, int i11) {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f48539a, i10, i11) : v(i10);
    }

    public boolean w0() {
        return this.f48539a.isEditable();
    }

    public void w1(boolean z10) {
        this.f48539a.setFocusable(z10);
    }

    public int x() {
        return this.f48539a.getChildCount();
    }

    public boolean x0() {
        return this.f48539a.isEnabled();
    }

    public void x1(boolean z10) {
        this.f48539a.setFocused(z10);
    }

    public CharSequence y() {
        return this.f48539a.getClassName();
    }

    public boolean y0() {
        return this.f48539a.isFocusable();
    }

    public void y1(boolean z10) {
        c1(67108864, z10);
    }

    public boolean z0() {
        return this.f48539a.isFocused();
    }

    public void z1(boolean z10) {
        this.f48539a.setHeading(z10);
    }

    public static class h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f48588b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f48589c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f48590d = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f48591a;

        h(Object obj) {
            this.f48591a = obj;
        }

        public static h e(int i10, float f10, float f11, float f12) {
            return new h(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f48591a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f48591a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f48591a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f48591a).getType();
        }

        public h(int i10, float f10, float f11, float f12) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f48591a = b.a(i10, f10, f11, f12);
            } else {
                this.f48591a = AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12);
            }
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AccessibilityNodeInfo.TouchDelegateInfo f48592a;

        public i(@NonNull Map<Region, View> map) {
            this.f48592a = new AccessibilityNodeInfo.TouchDelegateInfo(map);
        }

        @p0
        public Region a(@g0(from = 0) int i10) {
            return this.f48592a.getRegionAt(i10);
        }

        @g0(from = 0)
        public int b() {
            return this.f48592a.getRegionCount();
        }

        @p0
        public j c(@NonNull Region region) {
            AccessibilityNodeInfo targetForRegion = this.f48592a.getTargetForRegion(region);
            if (targetForRegion != null) {
                return j.r2(targetForRegion);
            }
            return null;
        }

        i(@NonNull AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.f48592a = touchDelegateInfo;
        }
    }

    private j(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f48539a = accessibilityNodeInfo;
    }
}
