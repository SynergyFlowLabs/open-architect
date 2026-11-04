package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.customview.view.AbsSavedState;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    static final boolean f11018i4 = false;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    static final String f11019j4 = "SearchView";

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final String f11020k4 = "nm";

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    static final o f11021l4 = null;
    private final int A3;
    private final int B3;
    private final Intent C3;
    private final Intent D3;
    private final CharSequence E3;
    private m F3;
    private l G3;
    View.OnFocusChangeListener H3;
    private n I3;
    private View.OnClickListener J3;
    private boolean K3;
    private boolean L3;
    androidx.cursoradapter.widget.a M3;
    private boolean N3;
    private CharSequence O3;
    private boolean P3;
    private boolean Q3;
    private int R3;
    private boolean S3;
    private CharSequence T3;
    private CharSequence U3;
    private boolean V3;
    private int W3;
    SearchableInfo X3;
    private Bundle Y3;
    private final Runnable Z3;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private Runnable f11022a4;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f11023b4;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private final View.OnClickListener f11024c4;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    View.OnKeyListener f11025d4;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private final TextView.OnEditorActionListener f11026e4;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f11027f4;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f11028g4;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private TextWatcher f11029h4;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    final SearchAutoComplete f11030k3;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final View f11031l3;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private final View f11032m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private final View f11033n3;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    final ImageView f11034o3;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    final ImageView f11035p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    final ImageView f11036q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    final ImageView f11037r3;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final View f11038s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private p f11039t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private Rect f11040u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private Rect f11041v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int[] f11042w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private int[] f11043x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private final ImageView f11044y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private final Drawable f11045z3;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f11046c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f11046c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.f11046c));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f11046c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public static class SearchAutoComplete extends androidx.appcompat.widget.e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f11047e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SearchView f11048f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f11049g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f11050h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.d();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            k.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        boolean c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        void d() {
            if (this.f11049g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f11049g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f11047e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.e, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f11049g) {
                removeCallbacks(this.f11050h);
                post(this.f11050h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.f11048f.e0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f11048f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f11048f.hasFocus() && getVisibility() == 0) {
                this.f11049g = true;
                if (SearchView.P(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.f11049g = false;
                removeCallbacks(this.f11050h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f11049g = true;
                    return;
                }
                this.f11049g = false;
                removeCallbacks(this.f11050h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f11048f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f11047e = i10;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, i.a.b.S);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.f11050h = new a();
            this.f11047e = getThreshold();
        }
    }

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.d0(charSequence);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.k0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.cursoradapter.widget.a aVar = SearchView.this.M3;
            if (aVar instanceof c1) {
                aVar.a(null);
            }
        }
    }

    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.H3;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.D();
        }
    }

    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f11034o3) {
                searchView.a0();
                return;
            }
            if (view == searchView.f11036q3) {
                searchView.W();
                return;
            }
            if (view == searchView.f11035p3) {
                searchView.b0();
            } else if (view == searchView.f11037r3) {
                searchView.f0();
            } else if (view == searchView.f11030k3) {
                searchView.J();
            }
        }
    }

    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.X3 == null) {
                return false;
            }
            if (searchView.f11030k3.isPopupShowing() && SearchView.this.f11030k3.getListSelection() != -1) {
                return SearchView.this.c0(view, i10, keyEvent);
            }
            if (SearchView.this.f11030k3.c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            int i11 = 2 & 0;
            searchView2.U(0, null, searchView2.f11030k3.getText().toString());
            return true;
        }
    }

    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.b0();
            return true;
        }
    }

    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.X(i10, 0, null);
        }
    }

    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.Y(i10);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @androidx.annotation.w0(29)
    static class k {
        private k() {
        }

        @androidx.annotation.u
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @androidx.annotation.u
        static void b(SearchAutoComplete searchAutoComplete, int i10) {
            searchAutoComplete.setInputMethodMode(i10);
        }
    }

    public interface l {
        boolean onClose();
    }

    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface n {
        boolean onSuggestionClick(int i10);

        boolean onSuggestionSelect(int i10);
    }

    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f11062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f11063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f11064c;

        @e.a({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        o() {
            this.f11062a = null;
            this.f11063b = null;
            this.f11064c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f11062a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f11063b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f11064c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f11063b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f11062a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f11064c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    private static class p extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f11065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f11066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f11067c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f11068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f11069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11070f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f11069e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f11066b = new Rect();
            this.f11068d = new Rect();
            this.f11067c = new Rect();
            a(rect, rect2);
            this.f11065a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f11066b.set(rect);
            this.f11068d.set(rect);
            Rect rect3 = this.f11068d;
            int i10 = this.f11069e;
            rect3.inset(-i10, -i10);
            this.f11067c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x004e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z10;
            boolean z11;
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z12 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z11 = this.f11070f;
                    if (z11 && !this.f11068d.contains(x10, y10)) {
                        z12 = z11;
                        z10 = false;
                    }
                } else if (action != 3) {
                    z10 = true;
                    z12 = false;
                } else {
                    z11 = this.f11070f;
                    this.f11070f = false;
                }
                z12 = z11;
                z10 = true;
            } else if (this.f11066b.contains(x10, y10)) {
                this.f11070f = true;
                z10 = true;
            } else {
                z10 = true;
                z12 = false;
            }
            if (!z12) {
                return false;
            }
            if (!z10 || this.f11067c.contains(x10, y10)) {
                Rect rect = this.f11067c;
                motionEvent.setLocation(x10 - rect.left, y10 - rect.top);
            } else {
                motionEvent.setLocation(this.f11065a.getWidth() / 2, this.f11065a.getHeight() / 2);
            }
            return this.f11065a.dispatchTouchEvent(motionEvent);
        }
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private Intent E(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.U3);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.Y3;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.X3.getSearchActivity());
        return intent;
    }

    private Intent F(Cursor cursor, int i10, String str) {
        String strT;
        try {
            try {
                String strT2 = c1.t(cursor, "suggest_intent_action");
                if (strT2 == null) {
                    strT2 = this.X3.getSuggestIntentAction();
                }
                if (strT2 == null) {
                    strT2 = "android.intent.action.SEARCH";
                }
                String str2 = strT2;
                String strT3 = c1.t(cursor, "suggest_intent_data");
                if (strT3 == null) {
                    strT3 = this.X3.getSuggestIntentData();
                }
                if (strT3 != null && (strT = c1.t(cursor, "suggest_intent_data_id")) != null) {
                    strT3 = strT3 + "/" + Uri.encode(strT);
                }
                return E(str2, strT3 == null ? null : Uri.parse(strT3), c1.t(cursor, "suggest_intent_extra_data"), c1.t(cursor, "suggest_intent_query"), i10, str);
            } catch (RuntimeException unused) {
                return null;
            }
        } catch (RuntimeException unused2) {
            cursor.getPosition();
            return null;
        }
    }

    private Intent G(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.Y3;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent H(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    private void I() {
        this.f11030k3.dismissDropDown();
    }

    private void K(View view, Rect rect) {
        view.getLocationInWindow(this.f11042w3);
        getLocationInWindow(this.f11043x3);
        int[] iArr = this.f11042w3;
        int i10 = iArr[1];
        int[] iArr2 = this.f11043x3;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    private CharSequence L(CharSequence charSequence) {
        if (this.K3 && this.f11045z3 != null) {
            int textSize = (int) (((double) this.f11030k3.getTextSize()) * 1.25d);
            this.f11045z3.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            boolean z10 = !false;
            spannableStringBuilder.setSpan(new ImageSpan(this.f11045z3), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    private boolean M() {
        Intent intent;
        SearchableInfo searchableInfo = this.X3;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.X3.getVoiceSearchLaunchWebSearch()) {
                intent = this.C3;
            } else {
                intent = this.X3.getVoiceSearchLaunchRecognizer() ? this.D3 : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean P(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean R() {
        return (this.N3 || this.S3) && !O();
    }

    private void T(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException unused) {
            intent.toString();
        }
    }

    private boolean V(int i10, int i11, String str) {
        Cursor cursorB = this.M3.b();
        if (cursorB == null || !cursorB.moveToPosition(i10)) {
            return false;
        }
        T(F(cursorB, i11, str));
        return true;
    }

    private void g0() {
        post(this.Z3);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(i.a.e.f286081c0);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(i.a.e.f286083d0);
    }

    private void h0(int i10) {
        Editable text = this.f11030k3.getText();
        Cursor cursorB = this.M3.b();
        if (cursorB == null) {
            return;
        }
        if (!cursorB.moveToPosition(i10)) {
            setQuery(text);
            return;
        }
        CharSequence charSequenceConvertToString = this.M3.convertToString(cursorB);
        if (charSequenceConvertToString != null) {
            setQuery(charSequenceConvertToString);
        } else {
            setQuery(text);
        }
    }

    private void j0() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f11030k3.getText());
        this.f11036q3.setVisibility(!zIsEmpty || (this.K3 && !this.V3) ? 0 : 8);
        Drawable drawable = this.f11036q3.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void l0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f11030k3;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(L(queryHint));
    }

    private void m0() {
        this.f11030k3.setThreshold(this.X3.getSuggestThreshold());
        this.f11030k3.setImeOptions(this.X3.getImeOptions());
        int inputType = this.X3.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.X3.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f11030k3.setInputType(inputType);
        androidx.cursoradapter.widget.a aVar = this.M3;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.X3.getSuggestAuthority() != null) {
            c1 c1Var = new c1(getContext(), this, this.X3, this.f11023b4);
            this.M3 = c1Var;
            this.f11030k3.setAdapter(c1Var);
            ((c1) this.M3).D(this.P3 ? 2 : 1);
        }
    }

    private void n0() {
        this.f11033n3.setVisibility((R() && (this.f11035p3.getVisibility() == 0 || this.f11037r3.getVisibility() == 0)) ? 0 : 8);
    }

    private void o0(boolean z10) {
        this.f11035p3.setVisibility((this.N3 && R() && hasFocus() && (z10 || !this.S3)) ? 0 : 8);
    }

    private void p0(boolean z10) {
        this.L3 = z10;
        int i10 = 8;
        int i11 = z10 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f11030k3.getText());
        this.f11034o3.setVisibility(i11);
        o0(!zIsEmpty);
        this.f11031l3.setVisibility(z10 ? 8 : 0);
        if (this.f11044y3.getDrawable() != null && !this.K3) {
            i10 = 0;
        }
        this.f11044y3.setVisibility(i10);
        j0();
        q0(zIsEmpty);
        n0();
    }

    private void q0(boolean z10) {
        int i10 = 8;
        if (this.S3 && !O() && z10) {
            this.f11035p3.setVisibility(8);
            i10 = 0;
        }
        this.f11037r3.setVisibility(i10);
    }

    private void setQuery(CharSequence charSequence) {
        this.f11030k3.setText(charSequence);
        this.f11030k3.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    void D() {
        if (this.f11038s3.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f11032m3.getPaddingLeft();
            Rect rect = new Rect();
            boolean zB = v1.b(this);
            int dimensionPixelSize = this.K3 ? resources.getDimensionPixelSize(i.a.e.P) + resources.getDimensionPixelSize(i.a.e.Q) : 0;
            this.f11030k3.getDropDownBackground().getPadding(rect);
            this.f11030k3.setDropDownHorizontalOffset(zB ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
            this.f11030k3.setDropDownWidth((((this.f11038s3.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    void J() {
        k.a(this.f11030k3);
    }

    public boolean N() {
        return this.K3;
    }

    public boolean O() {
        return this.L3;
    }

    public boolean Q() {
        return this.P3;
    }

    public boolean S() {
        return this.N3;
    }

    void U(int i10, String str, String str2) {
        getContext().startActivity(E("android.intent.action.SEARCH", null, null, str2, i10, str));
    }

    void W() {
        if (!TextUtils.isEmpty(this.f11030k3.getText())) {
            this.f11030k3.setText("");
            this.f11030k3.requestFocus();
            this.f11030k3.setImeVisibility(true);
        } else if (this.K3) {
            l lVar = this.G3;
            if (lVar == null || !lVar.onClose()) {
                clearFocus();
                p0(true);
            }
        }
    }

    boolean X(int i10, int i11, String str) {
        n nVar = this.I3;
        if (nVar != null && nVar.onSuggestionClick(i10)) {
            return false;
        }
        V(i10, 0, null);
        this.f11030k3.setImeVisibility(false);
        I();
        return true;
    }

    boolean Y(int i10) {
        n nVar = this.I3;
        if (nVar != null && nVar.onSuggestionSelect(i10)) {
            return false;
        }
        h0(i10);
        return true;
    }

    protected void Z(@androidx.annotation.p0 CharSequence charSequence) {
        setQuery(charSequence);
    }

    void a0() {
        p0(false);
        this.f11030k3.requestFocus();
        this.f11030k3.setImeVisibility(true);
        View.OnClickListener onClickListener = this.J3;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void b0() {
        Editable text = this.f11030k3.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        m mVar = this.F3;
        if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
            if (this.X3 != null) {
                U(0, null, text.toString());
            }
            this.f11030k3.setImeVisibility(false);
            I();
        }
    }

    boolean c0(View view, int i10, KeyEvent keyEvent) {
        if (this.X3 != null && this.M3 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return X(this.f11030k3.getListSelection(), 0, null);
            }
            if (i10 != 21 && i10 != 22) {
                if (i10 == 19) {
                    this.f11030k3.getListSelection();
                    return false;
                }
            }
            this.f11030k3.setSelection(i10 == 21 ? 0 : this.f11030k3.length());
            this.f11030k3.setListSelection(0);
            this.f11030k3.clearListSelection();
            this.f11030k3.b();
            int i11 = 1 << 1;
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.Q3 = true;
        super.clearFocus();
        this.f11030k3.clearFocus();
        this.f11030k3.setImeVisibility(false);
        this.Q3 = false;
    }

    void d0(CharSequence charSequence) {
        Editable text = this.f11030k3.getText();
        this.U3 = text;
        boolean zIsEmpty = TextUtils.isEmpty(text);
        o0(!zIsEmpty);
        q0(zIsEmpty);
        j0();
        n0();
        if (this.F3 != null && !TextUtils.equals(charSequence, this.T3)) {
            this.F3.onQueryTextChange(charSequence.toString());
        }
        this.T3 = charSequence.toString();
    }

    void e0() {
        p0(O());
        g0();
        if (this.f11030k3.hasFocus()) {
            J();
        }
    }

    void f0() {
        SearchableInfo searchableInfo = this.X3;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(H(this.C3, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(G(this.D3, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public int getImeOptions() {
        return this.f11030k3.getImeOptions();
    }

    public int getInputType() {
        return this.f11030k3.getInputType();
    }

    public int getMaxWidth() {
        return this.R3;
    }

    public CharSequence getQuery() {
        return this.f11030k3.getText();
    }

    @androidx.annotation.p0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.O3;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.X3;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.E3 : getContext().getText(this.X3.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.B3;
    }

    int getSuggestionRowLayout() {
        return this.A3;
    }

    public androidx.cursoradapter.widget.a getSuggestionsAdapter() {
        return this.M3;
    }

    public void i0(CharSequence charSequence, boolean z10) {
        this.f11030k3.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f11030k3;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.U3 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            b0();
        }
    }

    void k0() {
        int[] iArr = this.f11030k3.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f11032m3.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f11033n3.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        i0("", false);
        clearFocus();
        p0(true);
        this.f11030k3.setImeOptions(this.W3);
        this.V3 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.V3) {
            return;
        }
        this.V3 = true;
        int imeOptions = this.f11030k3.getImeOptions();
        this.W3 = imeOptions;
        this.f11030k3.setImeOptions(imeOptions | com.google.api.client.googleapis.media.a.f115410j);
        this.f11030k3.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.Z3);
        post(this.f11022a4);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            K(this.f11030k3, this.f11040u3);
            Rect rect = this.f11041v3;
            Rect rect2 = this.f11040u3;
            int i14 = 7 ^ 0;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            p pVar = this.f11039t3;
            if (pVar != null) {
                pVar.a(this.f11041v3, this.f11040u3);
                return;
            }
            p pVar2 = new p(this.f11041v3, this.f11040u3, this.f11030k3);
            this.f11039t3 = pVar2;
            setTouchDelegate(pVar2);
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        if (O()) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == Integer.MIN_VALUE) {
            int i13 = this.R3;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.R3;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i12 = this.R3) > 0) {
            size = Math.min(i12, size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        p0(savedState.f11046c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11046c = O();
        return savedState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        g0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i10, Rect rect) {
        if (this.Q3 || !isFocusable()) {
            return false;
        }
        if (O()) {
            return super.requestFocus(i10, rect);
        }
        boolean zRequestFocus = this.f11030k3.requestFocus(i10, rect);
        if (zRequestFocus) {
            p0(false);
        }
        return zRequestFocus;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.Y3 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            W();
        } else {
            a0();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.K3 == z10) {
            return;
        }
        this.K3 = z10;
        p0(z10);
        l0();
    }

    public void setImeOptions(int i10) {
        this.f11030k3.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f11030k3.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.R3 = i10;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.G3 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.H3 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.F3 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.J3 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.I3 = nVar;
    }

    public void setQueryHint(@androidx.annotation.p0 CharSequence charSequence) {
        this.O3 = charSequence;
        l0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.P3 = z10;
        androidx.cursoradapter.widget.a aVar = this.M3;
        if (aVar instanceof c1) {
            ((c1) aVar).D(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.X3 = searchableInfo;
        if (searchableInfo != null) {
            m0();
            l0();
        }
        boolean zM = M();
        this.S3 = zM;
        if (zM) {
            this.f11030k3.setPrivateImeOptions(f11020k4);
        }
        p0(O());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.N3 = z10;
        p0(O());
    }

    public void setSuggestionsAdapter(androidx.cursoradapter.widget.a aVar) {
        this.M3 = aVar;
        this.f11030k3.setAdapter(aVar);
    }

    public SearchView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.N2);
    }

    public SearchView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11040u3 = new Rect();
        this.f11041v3 = new Rect();
        this.f11042w3 = new int[2];
        this.f11043x3 = new int[2];
        this.Z3 = new b();
        this.f11022a4 = new c();
        this.f11023b4 = new WeakHashMap<>();
        f fVar = new f();
        this.f11024c4 = fVar;
        this.f11025d4 = new g();
        h hVar = new h();
        this.f11026e4 = hVar;
        i iVar = new i();
        this.f11027f4 = iVar;
        j jVar = new j();
        this.f11028g4 = jVar;
        this.f11029h4 = new a();
        j1 j1VarG = j1.G(context, attributeSet, i.a.m.f286492b5, i10, 0);
        androidx.core.view.u1.E1(this, context, i.a.m.f286492b5, attributeSet, j1VarG.B(), i10, 0);
        LayoutInflater.from(context).inflate(j1VarG.u(i.a.m.f286663v5, i.a.j.f286268z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(i.a.g.f286189e0);
        this.f11030k3 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f11031l3 = findViewById(i.a.g.f286181a0);
        View viewFindViewById = findViewById(i.a.g.f286187d0);
        this.f11032m3 = viewFindViewById;
        View viewFindViewById2 = findViewById(i.a.g.f286209o0);
        this.f11033n3 = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(i.a.g.Y);
        this.f11034o3 = imageView;
        ImageView imageView2 = (ImageView) findViewById(i.a.g.f286183b0);
        this.f11035p3 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(i.a.g.Z);
        this.f11036q3 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(i.a.g.f286191f0);
        this.f11037r3 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(i.a.g.f286185c0);
        this.f11044y3 = imageView5;
        androidx.core.view.u1.O1(viewFindViewById, j1VarG.h(i.a.m.f286671w5));
        androidx.core.view.u1.O1(viewFindViewById2, j1VarG.h(i.a.m.B5));
        imageView.setImageDrawable(j1VarG.h(i.a.m.f286695z5));
        imageView2.setImageDrawable(j1VarG.h(i.a.m.f286631r5));
        imageView3.setImageDrawable(j1VarG.h(i.a.m.f286607o5));
        imageView4.setImageDrawable(j1VarG.h(i.a.m.E5));
        imageView5.setImageDrawable(j1VarG.h(i.a.m.f286695z5));
        this.f11045z3 = j1VarG.h(i.a.m.f286687y5);
        p1.a(imageView, getResources().getString(i.a.k.f286290v));
        this.A3 = j1VarG.u(i.a.m.C5, i.a.j.f286267y);
        this.B3 = j1VarG.u(i.a.m.f286615p5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f11029h4);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f11025d4);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(j1VarG.a(i.a.m.f286655u5, true));
        int iG = j1VarG.g(i.a.m.f286519e5, -1);
        if (iG != -1) {
            setMaxWidth(iG);
        }
        this.E3 = j1VarG.x(i.a.m.f286623q5);
        this.O3 = j1VarG.x(i.a.m.f286679x5);
        int iO = j1VarG.o(i.a.m.f286555i5, -1);
        if (iO != -1) {
            setImeOptions(iO);
        }
        int iO2 = j1VarG.o(i.a.m.f286546h5, -1);
        if (iO2 != -1) {
            setInputType(iO2);
        }
        setFocusable(j1VarG.a(i.a.m.f286510d5, true));
        j1VarG.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.C3 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.D3 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f11038s3 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new e());
        }
        p0(this.K3);
        l0();
    }
}
