package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class m extends a {

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final ListView f49136o3;

    public m(@NonNull ListView listView) {
        super(listView);
        this.f49136o3 = listView;
    }

    @Override // androidx.core.widget.a
    public boolean a(int i10) {
        return false;
    }

    @Override // androidx.core.widget.a
    public boolean b(int i10) {
        ListView listView = this.f49136o3;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i11 = firstVisiblePosition + childCount;
        if (i10 > 0) {
            if (i11 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i10 >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.a
    public void l(int i10, int i11) {
        this.f49136o3.scrollListBy(i11);
    }
}
