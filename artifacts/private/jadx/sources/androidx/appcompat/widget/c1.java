package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class c1 extends androidx.cursoradapter.widget.c implements View.OnClickListener {

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final boolean f11204i3 = false;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f11205j3 = "SuggestionsAdapter";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f11206k3 = 50;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    static final int f11207l3 = 0;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    static final int f11208m3 = 1;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    static final int f11209n3 = 2;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    static final int f11210o3 = -1;
    private int H1;
    private boolean X;
    private int Y;
    private ColorStateList Z;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f11211g3;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private int f11212h3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final SearchView f11213o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f11214p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f11215p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f11216p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final SearchableInfo f11217s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f11218t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f11219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f11220w;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f11221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f11222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f11223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f11224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f11225e;

        public a(View view) {
            this.f11221a = (TextView) view.findViewById(R.id.text1);
            this.f11222b = (TextView) view.findViewById(R.id.text2);
            this.f11223c = (ImageView) view.findViewById(R.id.icon1);
            this.f11224d = (ImageView) view.findViewById(R.id.icon2);
            this.f11225e = (ImageView) view.findViewById(i.a.g.f286230z);
        }
    }

    public c1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.X = false;
        this.Y = 1;
        this.f11214p0 = -1;
        this.f11215p1 = -1;
        this.H1 = -1;
        this.f11216p2 = -1;
        this.f11211g3 = -1;
        this.f11212h3 = -1;
        this.f11213o = searchView;
        this.f11217s = searchableInfo;
        this.f11220w = searchView.getSuggestionCommitIconResId();
        this.f11218t = context;
        this.f11219v = weakHashMap;
    }

    private static String C(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception unused) {
            return null;
        }
    }

    private void E(ImageView imageView, Drawable drawable, int i10) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i10);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void F(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void G(String str, Drawable drawable) {
        if (drawable != null) {
            this.f11219v.put(str, drawable.getConstantState());
        }
    }

    private void H(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable o(String str) {
        Drawable.ConstantState constantState = this.f11219v.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence q(CharSequence charSequence) {
        if (this.Z == null) {
            TypedValue typedValue = new TypedValue();
            this.f11218t.getTheme().resolveAttribute(i.a.b.f286011x3, typedValue, true);
            this.Z = this.f11218t.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.Z, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable r(ComponentName componentName) {
        PackageManager packageManager = this.f11218t.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            componentName.flattenToShortString();
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.toString();
            return null;
        }
    }

    private Drawable s(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f11219v.containsKey(strFlattenToShortString)) {
            Drawable.ConstantState constantState2 = this.f11219v.get(strFlattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f11218t.getResources());
        }
        Drawable drawableR = r(componentName);
        if (drawableR != null) {
            constantState = drawableR.getConstantState();
        }
        this.f11219v.put(strFlattenToShortString, constantState);
        return drawableR;
    }

    public static String t(Cursor cursor, String str) {
        return C(cursor, cursor.getColumnIndex(str));
    }

    private Drawable u() {
        Drawable drawableS = s(this.f11217s.getSearchActivity());
        return drawableS != null ? drawableS : this.f11218t.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable v(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return w(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f11218t.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException unused2) {
                    uri.toString();
                    return drawableCreateFromStream;
                }
            } catch (Throwable th2) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused3) {
                    uri.toString();
                }
                throw th2;
            }
        } catch (FileNotFoundException e10) {
            Objects.toString(uri);
            e10.getMessage();
            return null;
        }
        Objects.toString(uri);
        e10.getMessage();
        return null;
    }

    private Drawable x(String str) {
        if (str != null && !str.isEmpty() && !com.facebook.appevents.p.f99189d0.equals(str)) {
            try {
                int i10 = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f11218t.getPackageName() + "/" + i10;
                Drawable drawableO = o(str2);
                if (drawableO != null) {
                    return drawableO;
                }
                Drawable drawableL = androidx.core.content.d.l(this.f11218t, i10);
                G(str2, drawableL);
                return drawableL;
            } catch (Resources.NotFoundException unused) {
                return null;
            } catch (NumberFormatException unused2) {
                Drawable drawableO2 = o(str);
                if (drawableO2 != null) {
                    return drawableO2;
                }
                Drawable drawableV = v(Uri.parse(str));
                G(str, drawableV);
                return drawableV;
            }
        }
        return null;
    }

    private Drawable y(Cursor cursor) {
        int i10 = this.f11216p2;
        if (i10 == -1) {
            return null;
        }
        Drawable drawableX = x(cursor.getString(i10));
        return drawableX != null ? drawableX : u();
    }

    private Drawable z(Cursor cursor) {
        int i10 = this.f11211g3;
        if (i10 == -1) {
            return null;
        }
        return x(cursor.getString(i10));
    }

    public int A() {
        return this.Y;
    }

    Cursor B(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(FirebaseAnalytics.d.P).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            int i11 = 3 | 0;
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f11218t.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void D(int i10) {
        this.Y = i10;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public void a(Cursor cursor) {
        if (this.X) {
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f11214p0 = cursor.getColumnIndex("suggest_text_1");
                this.f11215p1 = cursor.getColumnIndex("suggest_text_2");
                this.H1 = cursor.getColumnIndex("suggest_text_2_url");
                this.f11216p2 = cursor.getColumnIndex("suggest_icon_1");
                this.f11211g3 = cursor.getColumnIndex("suggest_icon_2");
                this.f11212h3 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f11213o.getVisibility() == 0 && this.f11213o.getWindowVisibility() == 0) {
            try {
                Cursor cursorB = B(this.f11217s, string, 50);
                if (cursorB != null) {
                    cursorB.getCount();
                    return cursorB;
                }
            } catch (RuntimeException unused) {
            }
        }
        return null;
    }

    @Override // androidx.cursoradapter.widget.a, androidx.cursoradapter.widget.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strT;
        String strT2;
        if (cursor == null) {
            return null;
        }
        String strT3 = t(cursor, "suggest_intent_query");
        if (strT3 != null) {
            return strT3;
        }
        if (this.f11217s.shouldRewriteQueryFromData() && (strT2 = t(cursor, "suggest_intent_data")) != null) {
            return strT2;
        }
        if (!this.f11217s.shouldRewriteQueryFromText() || (strT = t(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strT;
    }

    @Override // androidx.cursoradapter.widget.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i10 = this.f11212h3;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f11221a != null) {
            F(aVar.f11221a, C(cursor, this.f11214p0));
        }
        if (aVar.f11222b != null) {
            String strC = C(cursor, this.H1);
            CharSequence charSequenceQ = strC != null ? q(strC) : C(cursor, this.f11215p1);
            if (TextUtils.isEmpty(charSequenceQ)) {
                TextView textView = aVar.f11221a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f11221a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f11221a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f11221a.setMaxLines(1);
                }
            }
            F(aVar.f11222b, charSequenceQ);
        }
        ImageView imageView = aVar.f11223c;
        if (imageView != null) {
            E(imageView, y(cursor), 4);
        }
        ImageView imageView2 = aVar.f11224d;
        if (imageView2 != null) {
            E(imageView2, z(cursor), 8);
        }
        int i12 = this.Y;
        if (i12 != 2 && (i12 != 1 || (i11 & 1) == 0)) {
            aVar.f11225e.setVisibility(8);
            return;
        }
        aVar.f11225e.setVisibility(0);
        aVar.f11225e.setTag(aVar.f11221a.getText());
        aVar.f11225e.setOnClickListener(this);
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewH = h(this.f11218t, b(), viewGroup);
            if (viewH != null) {
                ((a) viewH.getTag()).f11221a.setText(e10.toString());
            }
            return viewH;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            View viewI = i(this.f11218t, b(), viewGroup);
            if (viewI != null) {
                ((a) viewI.getTag()).f11221a.setText(e10.toString());
            }
            return viewI;
        }
    }

    @Override // androidx.cursoradapter.widget.a, android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // androidx.cursoradapter.widget.c, androidx.cursoradapter.widget.a
    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewI = super.i(context, cursor, viewGroup);
        viewI.setTag(new a(viewI));
        ((ImageView) viewI.findViewById(i.a.g.f286230z)).setImageResource(this.f11220w);
        return viewI;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        H(b());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        H(b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f11213o.Z((CharSequence) tag);
        }
    }

    public void p() {
        a(null);
        this.X = true;
    }

    Drawable w(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f11218t.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }
}
