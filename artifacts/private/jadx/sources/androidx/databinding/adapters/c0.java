package androidx.databinding.adapters;

import android.widget.TabHost;
import androidx.annotation.b1;

/* JADX INFO: loaded from: classes2.dex */
@b1({b1.a.LIBRARY})
public class c0 {

    class a implements TabHost.OnTabChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TabHost.OnTabChangeListener f49265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.databinding.o f49266b;

        a(TabHost.OnTabChangeListener onTabChangeListener, androidx.databinding.o oVar) {
            this.f49265a = onTabChangeListener;
            this.f49266b = oVar;
        }

        @Override // android.widget.TabHost.OnTabChangeListener
        public void onTabChanged(String str) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f49265a;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.f49266b.a();
        }
    }

    @androidx.databinding.n(attribute = "android:currentTab")
    public static int a(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @androidx.databinding.n(attribute = "android:currentTab")
    public static String b(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @androidx.databinding.d({"android:currentTab"})
    public static void c(TabHost tabHost, int i10) {
        if (tabHost.getCurrentTab() != i10) {
            tabHost.setCurrentTab(i10);
        }
    }

    @androidx.databinding.d({"android:currentTab"})
    public static void d(TabHost tabHost, String str) {
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag == null || currentTabTag.equals(str)) && (currentTabTag != null || str == null)) {
            return;
        }
        tabHost.setCurrentTabByTag(str);
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void e(TabHost tabHost, TabHost.OnTabChangeListener onTabChangeListener, androidx.databinding.o oVar) {
        if (oVar == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new a(onTabChangeListener, oVar));
        }
    }
}
