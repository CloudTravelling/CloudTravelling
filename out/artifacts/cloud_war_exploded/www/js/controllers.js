angular.module('app.controllers', [])

.controller('indexCtrl', function($scope) {

})

.controller('busCtrl', function($scope, $http) {
  $http.get("/getBusData")
    .success(function(response) {
      $scope.results = response.result;
    });
})


.controller('trafficCtrl', function($scope, $http) {
  $http.get("/getTrafficData")
    .success(function(response) {
      $scope.res = response;
    });
})

.controller('flightCtrl', function($scope, $http) {
  $http.get("/getFlightData")
    .success(function(response) {
      $scope.results = response.result;
    });
})
