#include <iostream>
Name:anas hamada abdo
ID:20190116
using namespace std;
class publication
{
private:
    string title;
    float price;
public:
    void getwork(void)
    {
       string x;
        float y;
        cout<<"please enter your title"<<endl;
        cin>>x;
        cout<<"please enter your price"<<endl;
        cin>>y;
        title=x;
        price=y;
    }
    void setwork(void)
    {
        cout<<"publication title is:   "<<title<<endl;
        cout<<"publication price is:   "<<price<<endl;
    }

};
class book :public publication
{
private:
    int counte;
public:
    void getwork(void)
    {
        publication::getwork();
        cout<<"enter book pages"<<endl;
        cin>>counte;
    }
    void setwork(void)
    {
        publication::setwork();
        cout<<"book page count is:  "<<counte<<endl;
    }
};
class tape: public publication
{
private:
    float minutes;
public:
    void getwork(void)
    {
        publication::getwork();
        cout<<"enter tape time"<<endl;
        cin>>minutes;
    }
    void setwork(void)
    {
        publication::setwork();
        cout<<"tape time is:  "<<minutes<<endl;
    }
};
int main()
{
    book b;
    tape t;
    b.getwork();
    t.getwork();
    b.setwork();
    t.setwork();

    return 0;
}

