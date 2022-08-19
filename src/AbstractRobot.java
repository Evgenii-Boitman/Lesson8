

public abstract class AbstractRobot implements FactoryBody, FactoryHead {


    String name;
    int hitCount;
    String body;
    String head;

    public AbstractRobot(String name, String body, String head) {
        this.name = name;
        this.body = body;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }



    @Override
    public BodyType bodyType() {
        BodyType robotBody = null;
        hitCount = hitCount + 1;
        if (hitCount == 1) {
            robotBody = BodyType.BODY1;
        } else if (hitCount == 2) {
            robotBody = BodyType.BODY2;
        } else if (hitCount == 3) {
            robotBody = BodyType.BODY3;
        }
        return robotBody;
    }

    @Override
    public FactoryHead headType() {
        HeadType robotHead = null;
        hitCount = hitCount + 1;
        if (hitCount == 1) {
            robotHead = HeadType.HEAD1;
        } else if (hitCount == 2) {
            robotHead = HeadType.HEAD2;
        } else if (hitCount == 3) {
            robotHead = HeadType.HEAD3;
        }
        return robotHead;
    }

    @Override
    public String toString() {
        return
                "Robot{" +
                "name='" + name + '\'' +
                ", body='" + body + '\'' +
                ", head='" + head + '\'' +
                '}';

    }
}
