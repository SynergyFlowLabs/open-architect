package a;

import com.devtodev.analytics.internal.domain.events.people.PeopleParameter;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterBoolean;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterDouble;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterLong;
import com.devtodev.analytics.internal.domain.events.people.PeopleParameterString;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f399a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1) {
        super(1);
        this.f399a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PeopleParameter peopleParameter = (PeopleParameter) obj;
        if (peopleParameter instanceof PeopleParameterString) {
            this.f399a.invoke(((PeopleParameterString) peopleParameter).getValue());
        } else if (peopleParameter instanceof PeopleParameterLong) {
            this.f399a.invoke(Long.valueOf(((PeopleParameterLong) peopleParameter).getValue()));
        } else if (peopleParameter instanceof PeopleParameterDouble) {
            this.f399a.invoke(Double.valueOf(((PeopleParameterDouble) peopleParameter).getValue()));
        } else if (peopleParameter instanceof PeopleParameterBoolean) {
            this.f399a.invoke(Boolean.valueOf(((PeopleParameterBoolean) peopleParameter).getValue()));
        } else {
            this.f399a.invoke(null);
        }
        return Unit.f312394a;
    }
}
