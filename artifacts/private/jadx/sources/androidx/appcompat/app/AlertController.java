package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.u1;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final q f10105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f10106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f10107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f10108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f10109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f10110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f10111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f10112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10114k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10115l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f10116m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f10118o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f10119p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f10120q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f10121r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f10122s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f10123t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f10124u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f10125v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f10126w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f10127x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f10128y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f10129z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f10117n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10131b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z10, boolean z11) {
            if (z11 && z10) {
                return;
            }
            setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.f10130a, getPaddingRight(), z11 ? getPaddingBottom() : this.f10131b);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.m.Y4);
            this.f10131b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.a.m.Z4, -1);
            this.f10130a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.a.m.f286483a5, -1);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f10118o && (message3 = alertController.f10120q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f10122s || (message2 = alertController.f10124u) == null) {
                messageObtain = (view != alertController.f10126w || (message = alertController.f10128y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f10105b).sendToTarget();
        }
    }

    class b implements NestedScrollView.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f10134b;

        b(View view, View view2) {
            this.f10133a = view;
            this.f10134b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.e
        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.g(nestedScrollView, this.f10133a, this.f10134b);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f10137b;

        c(View view, View view2) {
            this.f10136a = view;
            this.f10137b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.A, this.f10136a, this.f10137b);
        }
    }

    class d implements AbsListView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f10140b;

        d(View view, View view2) {
            this.f10139a = view;
            this.f10140b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.g(absListView, this.f10139a, this.f10140b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f10142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f10143b;

        e(View view, View view2) {
            this.f10142a = view;
            this.f10143b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f10110g, this.f10142a, this.f10143b);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView.OnItemSelectedListener O;
        public e P;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f10145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f10146b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f10148d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f10150f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f10151g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f10152h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f10153i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f10154j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f10155k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f10156l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f10157m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f10158n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f10159o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f10160p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f10161q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f10163s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f10164t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f10165u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f10166v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f10167w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f10168x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f10169y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f10170z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10147c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10149e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean Q = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f10162r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10171a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f10171a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.f10171a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        class b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f10173a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f10174b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10175c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f10176d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f10175c = recycleListView;
                this.f10176d = alertController;
                Cursor cursor2 = getCursor();
                this.f10173a = cursor2.getColumnIndexOrThrow(f.this.L);
                this.f10174b = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f10173a));
                this.f10175c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f10174b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f10146b.inflate(this.f10176d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f10178a;

            c(AlertController alertController) {
                this.f10178a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f10168x.onClick(this.f10178a.f10105b, i10);
                if (!f.this.H) {
                    this.f10178a.f10105b.dismiss();
                }
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f10180a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f10181b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f10180a = recycleListView;
                this.f10181b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.f10180a.isItemChecked(i10);
                }
                f.this.J.onClick(this.f10181b.f10105b, i10, this.f10180a.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f10145a = context;
            this.f10146b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            f fVar;
            AlertController alertController2;
            ListAdapter hVar;
            RecycleListView recycleListView = (RecycleListView) this.f10146b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                fVar = this;
                alertController2 = alertController;
                int i10 = fVar.H ? alertController2.N : alertController2.O;
                if (fVar.K != null) {
                    hVar = new SimpleCursorAdapter(fVar.f10145a, i10, fVar.K, new String[]{fVar.L}, new int[]{R.id.text1});
                } else {
                    hVar = fVar.f10167w;
                    if (hVar == null) {
                        hVar = new h(fVar.f10145a, i10, R.id.text1, fVar.f10166v);
                    }
                }
            } else if (this.K == null) {
                fVar = this;
                hVar = fVar.new a(this.f10145a, alertController.M, R.id.text1, this.f10166v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                fVar = this;
                alertController2 = alertController;
                hVar = fVar.new b(fVar.f10145a, fVar.K, false, recycleListView, alertController2);
            }
            e eVar = fVar.P;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController2.H = hVar;
            alertController2.I = fVar.I;
            if (fVar.f10168x != null) {
                recycleListView.setOnItemClickListener(fVar.new c(alertController2));
            } else if (fVar.J != null) {
                recycleListView.setOnItemClickListener(fVar.new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = fVar.O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (fVar.H) {
                recycleListView.setChoiceMode(1);
            } else if (fVar.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f10110g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f10151g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f10150f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f10148d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i10 = this.f10147c;
                if (i10 != 0) {
                    alertController.o(i10);
                }
                int i11 = this.f10149e;
                if (i11 != 0) {
                    alertController.o(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f10152h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f10153i;
            if (charSequence3 == null && this.f10154j == null) {
                alertController2 = alertController;
            } else {
                alertController.l(-1, charSequence3, this.f10155k, null, this.f10154j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f10156l;
            if (charSequence4 != null || this.f10157m != null) {
                int i12 = 7 | (-2);
                alertController2.l(-2, charSequence4, this.f10158n, null, this.f10157m);
            }
            CharSequence charSequence5 = this.f10159o;
            if (charSequence5 != null || this.f10160p != null) {
                alertController2.l(-3, charSequence5, this.f10161q, null, this.f10160p);
            }
            if (this.f10166v != null || this.K != null || this.f10167w != null) {
                b(alertController2);
            }
            View view2 = this.f10170z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.v(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.u(view2);
                    return;
                }
            }
            int i13 = this.f10169y;
            if (i13 != 0) {
                alertController2.t(i13);
            }
        }
    }

    private static final class g extends Handler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f10183b = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f10184a;

        public g(DialogInterface dialogInterface) {
            this.f10184a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f10184a.get(), message.what);
            } else {
                if (i10 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, q qVar, Window window) {
        this.f10104a = context;
        this.f10105b = qVar;
        this.f10106c = window;
        this.R = new g(qVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, i.a.m.T, i.a.b.M, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(i.a.m.U, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(i.a.m.W, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(i.a.m.Y, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(i.a.m.Z, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(i.a.m.f286487b0, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(i.a.m.X, 0);
        int i10 = 1 >> 1;
        this.P = typedArrayObtainStyledAttributes.getBoolean(i.a.m.f286478a0, true);
        this.f10107d = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.a.m.V, 0);
        typedArrayObtainStyledAttributes.recycle();
        qVar.l(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f10106c.findViewById(i.a.g.O);
        View viewFindViewById4 = viewFindViewById3.findViewById(i.a.g.f286223v0);
        View viewFindViewById5 = viewFindViewById3.findViewById(i.a.g.f286220u);
        View viewFindViewById6 = viewFindViewById3.findViewById(i.a.g.f286212q);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(i.a.g.f286224w);
        y(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(i.a.g.f286223v0);
        View viewFindViewById8 = viewGroup.findViewById(i.a.g.f286220u);
        View viewFindViewById9 = viewGroup.findViewById(i.a.g.f286212q);
        ViewGroup viewGroupJ = j(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupJ2 = j(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupJ3 = j(viewFindViewById9, viewFindViewById6);
        x(viewGroupJ2);
        w(viewGroupJ3);
        z(viewGroupJ);
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (viewGroupJ == null || viewGroupJ.getVisibility() == 8) ? 0 : 1;
        boolean z12 = (viewGroupJ3 == null || viewGroupJ3.getVisibility() == 8) ? false : true;
        if (!z12 && viewGroupJ2 != null && (viewFindViewById2 = viewGroupJ2.findViewById(i.a.g.f286213q0)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f10109f == null && this.f10110g == null) ? null : viewGroupJ.findViewById(i.a.g.f286219t0);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupJ2 != null && (viewFindViewById = viewGroupJ2.findViewById(i.a.g.f286215r0)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f10110g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view = this.f10110g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                r(viewGroupJ2, view, z11 | (z12 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f10110g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i10 = this.I;
        if (i10 > -1) {
            listView2.setItemChecked(i10, true);
            listView2.setSelection(i10);
        }
    }

    private static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i.a.b.L, typedValue, true);
        return typedValue.data != 0;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    @p0
    private ViewGroup j(@p0 View view, @p0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int i10 = this.K;
        return (i10 != 0 && this.Q == 1) ? i10 : this.J;
    }

    private void r(ViewGroup viewGroup, View view, int i10, int i11) {
        View viewFindViewById = this.f10106c.findViewById(i.a.g.U);
        View viewFindViewById2 = this.f10106c.findViewById(i.a.g.T);
        u1.y2(view, i10, i11);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void w(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f10118o = button;
        button.setOnClickListener(this.S);
        boolean z10 = true | false;
        if (TextUtils.isEmpty(this.f10119p) && this.f10121r == null) {
            this.f10118o.setVisibility(8);
            i10 = 0;
        } else {
            this.f10118o.setText(this.f10119p);
            Drawable drawable = this.f10121r;
            if (drawable != null) {
                int i11 = this.f10107d;
                drawable.setBounds(0, 0, i11, i11);
                this.f10118o.setCompoundDrawables(this.f10121r, null, null, null);
            }
            this.f10118o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f10122s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f10123t) && this.f10125v == null) {
            this.f10122s.setVisibility(8);
        } else {
            this.f10122s.setText(this.f10123t);
            Drawable drawable2 = this.f10125v;
            if (drawable2 != null) {
                int i12 = this.f10107d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f10122s.setCompoundDrawables(this.f10125v, null, null, null);
            }
            this.f10122s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f10126w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f10127x) && this.f10129z == null) {
            this.f10126w.setVisibility(8);
        } else {
            this.f10126w.setText(this.f10127x);
            Drawable drawable3 = this.f10129z;
            if (drawable3 != null) {
                int i13 = this.f10107d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f10126w.setCompoundDrawables(this.f10129z, null, null, null);
            }
            this.f10126w.setVisibility(0);
            i10 |= 4;
        }
        if (B(this.f10104a)) {
            if (i10 == 1) {
                b(this.f10118o);
            } else if (i10 == 2) {
                b(this.f10122s);
            } else if (i10 == 4) {
                b(this.f10126w);
            }
        }
        if (i10 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f10106c.findViewById(i.a.g.V);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f10109f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f10110g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f10110g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void y(ViewGroup viewGroup) {
        View viewInflate = this.f10111h;
        if (viewInflate == null) {
            viewInflate = this.f10112i != 0 ? LayoutInflater.from(this.f10104a).inflate(this.f10112i, viewGroup, false) : null;
        }
        boolean z10 = viewInflate != null;
        if (!z10 || !a(viewInflate)) {
            this.f10106c.setFlags(131072, 131072);
        }
        if (!z10) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f10106c.findViewById(i.a.g.f286222v);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f10117n) {
            frameLayout.setPadding(this.f10113j, this.f10114k, this.f10115l, this.f10116m);
        }
        if (this.f10110g != null) {
            ((LinearLayout.LayoutParams) ((LinearLayoutCompat.b) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void z(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f10106c.findViewById(i.a.g.f286221u0).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f10106c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f10108e) || !this.P) {
            this.f10106c.findViewById(i.a.g.f286221u0).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f10106c.findViewById(i.a.g.f286210p);
        this.E = textView;
        textView.setText(this.f10108e);
        int i10 = this.B;
        if (i10 != 0) {
            this.D.setImageResource(i10);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f10126w;
        }
        if (i10 == -2) {
            return this.f10122s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f10118o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f10104a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f10110g;
    }

    public void f() {
        this.f10105b.setContentView(k());
        A();
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.x(keyEvent);
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.x(keyEvent);
    }

    public void l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f10127x = charSequence;
            this.f10128y = message;
            this.f10129z = drawable;
        } else if (i10 == -2) {
            this.f10123t = charSequence;
            this.f10124u = message;
            this.f10125v = drawable;
        } else {
            if (i10 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f10119p = charSequence;
            this.f10120q = message;
            this.f10121r = drawable;
        }
    }

    public void m(int i10) {
        this.Q = i10;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i10 != 0) {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public void p(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void q(CharSequence charSequence) {
        this.f10109f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(CharSequence charSequence) {
        this.f10108e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i10) {
        this.f10111h = null;
        this.f10112i = i10;
        this.f10117n = false;
    }

    public void u(View view) {
        this.f10111h = view;
        this.f10112i = 0;
        this.f10117n = false;
    }

    public void v(View view, int i10, int i11, int i12, int i13) {
        this.f10111h = view;
        this.f10112i = 0;
        this.f10117n = true;
        this.f10113j = i10;
        this.f10114k = i11;
        this.f10115l = i12;
        this.f10116m = i13;
    }
}
