package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
class a0 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f51758b = "FragmentManager";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final FragmentManager f51759a;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ q0 f51760a;

        a(q0 q0Var) {
            this.f51760a = q0Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentK = this.f51760a.k();
            this.f51760a.m();
            f1.u((ViewGroup) fragmentK.mView.getParent(), a0.this.f51759a).q();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    a0(FragmentManager fragmentManager) {
        this.f51759a = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @androidx.annotation.p0
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @androidx.annotation.p0
    public View onCreateView(@androidx.annotation.p0 View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        q0 q0VarG;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f51759a);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c2.a.d.f82388a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(c2.a.d.f82389b);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c2.a.d.f82390c, -1);
        String string = typedArrayObtainStyledAttributes.getString(c2.a.d.f82391d);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null && w.b(context.getClassLoader(), attributeValue)) {
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment fragmentV0 = resourceId != -1 ? this.f51759a.v0(resourceId) : null;
            if (fragmentV0 == null && string != null) {
                fragmentV0 = this.f51759a.w0(string);
            }
            if (fragmentV0 == null && id2 != -1) {
                fragmentV0 = this.f51759a.v0(id2);
            }
            if (fragmentV0 == null) {
                fragmentV0 = this.f51759a.L0().a(context.getClassLoader(), attributeValue);
                fragmentV0.mFromLayout = true;
                fragmentV0.mFragmentId = resourceId != 0 ? resourceId : id2;
                fragmentV0.mContainerId = id2;
                fragmentV0.mTag = string;
                fragmentV0.mInLayout = true;
                FragmentManager fragmentManager = this.f51759a;
                fragmentV0.mFragmentManager = fragmentManager;
                fragmentV0.mHost = fragmentManager.O0();
                fragmentV0.onInflate(this.f51759a.O0().f(), attributeSet, fragmentV0.mSavedFragmentState);
                q0VarG = this.f51759a.p(fragmentV0);
                if (FragmentManager.b1(2)) {
                    fragmentV0.toString();
                    Integer.toHexString(resourceId);
                }
            } else {
                if (fragmentV0.mInLayout) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
                }
                fragmentV0.mInLayout = true;
                FragmentManager fragmentManager2 = this.f51759a;
                fragmentV0.mFragmentManager = fragmentManager2;
                fragmentV0.mHost = fragmentManager2.O0();
                fragmentV0.onInflate(this.f51759a.O0().f(), attributeSet, fragmentV0.mSavedFragmentState);
                q0VarG = this.f51759a.G(fragmentV0);
                if (FragmentManager.b1(2)) {
                    fragmentV0.toString();
                    Integer.toHexString(resourceId);
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            d2.d.j(fragmentV0, viewGroup);
            fragmentV0.mContainer = viewGroup;
            q0VarG.m();
            q0VarG.j();
            View view2 = fragmentV0.mView;
            if (view2 == null) {
                throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
            }
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragmentV0.mView.getTag() == null) {
                fragmentV0.mView.setTag(string);
            }
            fragmentV0.mView.addOnAttachStateChangeListener(new a(q0VarG));
            return fragmentV0.mView;
        }
        return null;
    }
}
