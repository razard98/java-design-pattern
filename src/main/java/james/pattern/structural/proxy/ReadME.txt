*Proxy 패턴이란?

 다른 객체에 대한 엑세스를 제어하는 대리 객체를 만드는데 사용합니다.

 객체에 대한 엑세스를 제어하는 이유는 실제로 객체를 사용해야 할 때까지 생성 및 초기화의 비용을 연기 하는 것입니다.
특히 객체가 다른 엑세스 권한을 가져야 할 때 원본 객체에 대한 엑세스를 제어하는 데 매무 유용 할 수 있습니다.

 프록시 패턴에서 클라이언트는 원본 객체를 직접 호출하지 않고, 원본 객체를 호출하는 프록시 객체에 위임을 합니다.
중요한 점은 클라이언트가 프록시에 대해 알지 못한다는 것입니다.

