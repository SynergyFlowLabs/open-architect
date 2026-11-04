package androidx.appcompat.widget;

import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.w0(29)
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
public final class r0 implements InspectionCompanion<LinearLayoutCompat> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11507a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11511e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11512f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f11515i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11516j;

    class a implements IntFunction<String> {
        a() {
        }

        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String apply(int i10) {
            if (i10 != 0) {
                return i10 != 1 ? String.valueOf(i10) : "vertical";
            }
            return "horizontal";
        }
    }

    class b implements IntFunction<Set<String>> {
        b() {
        }

        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<String> apply(int i10) {
            HashSet hashSet = new HashSet();
            if (i10 == 0) {
                hashSet.add("none");
            }
            if (i10 == 1) {
                hashSet.add("beginning");
            }
            if (i10 == 2) {
                hashSet.add("middle");
            }
            if (i10 == 4) {
                hashSet.add("end");
            }
            return hashSet;
        }
    }

    @Override // android.view.inspector.InspectionCompanion
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void readProperties(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull PropertyReader propertyReader) {
        if (!this.f11507a) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readBoolean(this.f11508b, linearLayoutCompat.u());
        propertyReader.readInt(this.f11509c, linearLayoutCompat.getBaselineAlignedChildIndex());
        propertyReader.readGravity(this.f11510d, linearLayoutCompat.getGravity());
        propertyReader.readIntEnum(this.f11511e, linearLayoutCompat.getOrientation());
        propertyReader.readFloat(this.f11512f, linearLayoutCompat.getWeightSum());
        propertyReader.readObject(this.f11513g, linearLayoutCompat.getDividerDrawable());
        propertyReader.readInt(this.f11514h, linearLayoutCompat.getDividerPadding());
        propertyReader.readBoolean(this.f11515i, linearLayoutCompat.v());
        propertyReader.readIntFlag(this.f11516j, linearLayoutCompat.getShowDividers());
    }

    @Override // android.view.inspector.InspectionCompanion
    public void mapProperties(@NonNull PropertyMapper propertyMapper) {
        this.f11508b = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
        this.f11509c = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
        this.f11510d = propertyMapper.mapGravity("gravity", R.attr.gravity);
        this.f11511e = propertyMapper.mapIntEnum(io.sentry.protocol.e.c.f306223k, R.attr.orientation, new a());
        this.f11512f = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
        this.f11513g = propertyMapper.mapObject("divider", i.a.b.f285887b1);
        this.f11514h = propertyMapper.mapInt("dividerPadding", i.a.b.f285899d1);
        this.f11515i = propertyMapper.mapBoolean("measureWithLargestChild", i.a.b.f285942k2);
        this.f11516j = propertyMapper.mapIntFlag("showDividers", i.a.b.S2, new b());
        this.f11507a = true;
    }
}
